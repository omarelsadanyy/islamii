package com.example.new_islamii.ui.suraDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R
import com.example.new_islamii.ui.Constants

class SuraDetailsActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter_verse: verses_adapter
    lateinit var titletextview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        titletextview = findViewById(R.id.title_textview)
        initRecyclerview()
        val suraname: String = intent.getStringExtra(Constants.Etra_Sura_name) as String
        val surapos: Int = intent.getIntExtra(Constants.Extra_Sura_Pos, -1)
        titletextview.setText(suraname)
        readsura_file(surapos)
    }

    private fun initRecyclerview() {
        recyclerView = findViewById(R.id.recycler_view_verse)
        adapter_verse = verses_adapter()
        recyclerView.adapter = adapter_verse
    }

    private fun readsura_file(pos: Int) {
        val filename = "${pos + 1}.txt"
        val filecontent = assets.open(filename).bufferedReader().use { it.readText() }
        val verses: List<String> = filecontent.split("\n")
        adapter_verse.changedata(verses)
    }


}