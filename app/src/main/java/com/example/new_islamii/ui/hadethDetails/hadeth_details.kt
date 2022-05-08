package com.example.new_islamii.ui.hadethDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R
import com.example.new_islamii.ui.Constants

class hadeth_details : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter_hadeth: hadeth_detailsadapter
    lateinit var titletextview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadeth_details)
        setSupportActionBar(findViewById(R.id.toolbar1))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        titletextview = findViewById(R.id.title_textview1)
        initRecyclerview()
        val hadethname: String = intent.getStringExtra(Constants.Etra_hadeth_name) as String
        val hadethpos: Int = intent.getIntExtra(Constants.Extra_hadeth_Pos, -1)
        titletextview.setText(hadethname)
        readsura_file(hadethpos)
    }

    private fun initRecyclerview() {
        recyclerView = findViewById(R.id.recycler_view_hadeth1)
        adapter_hadeth = hadeth_detailsadapter()
        recyclerView.adapter = adapter_hadeth
    }

    private fun readsura_file(pos: Int) {
        val filename = "h${pos + 1}.txt"
        val filecontent = assets.open(filename).bufferedReader().use { it.readText() }
        val hadeth: List<String> = filecontent.split("\n")
        adapter_hadeth.changedata(hadeth)
    }

}