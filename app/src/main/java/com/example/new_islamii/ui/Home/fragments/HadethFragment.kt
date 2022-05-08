package com.example.new_islamii.ui.Home.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R
import com.example.new_islamii.ui.Constants
import com.example.new_islamii.ui.Home.fragments.Adapterhadethname.hadethadapter
import com.example.new_islamii.ui.hadethDetails.hadeth_details

class HadethFragment : Fragment() {
    var hadethsname = listOf<String>(
        "الحديث رقم 1",
        "الحديث رقم 2",
        "الحديث رقم 3",
        "الحديث رقم 4",
        "الحديث رقم 5",
        "الحديث رقم 6",
        "الحديث رقم 7",
        "الحديث رقم 8",
        "الحديث رقم 9",
        "الحديث رقم 10",
        "الحديث رقم 11",
        "الحديث رقم 12",
        "الحديث رقم 13",
        "الحديث رقم 14",
        "الحديث رقم 15",
        "الحديث رقم 16",
        "الحديث رقم 17",
        "الحديث رقم 18",
        "الحديث رقم 19",
        "الحديث رقم 20",
        "الحديث رقم 21",
        "الحديث رقم 22",
        "الحديث رقم 23",
        "الحديث رقم 24",
        "الحديث رقم 25",
        "الحديث رقم 26",
        "الحديث رقم 27",
        "الحديث رقم 28",
        "الحديث رقم 29",
        "الحديث رقم 30",
        "الحديث رقم 31",
        "الحديث رقم 32",
        "الحديث رقم 33",
        "الحديث رقم 34",
        "الحديث رقم 35",
        "الحديث رقم 36",
        "الحديث رقم 37",
        "الحديث رقم 38",
        "الحديث رقم 39",
        "الحديث رقم 40",
        "الحديث رقم 41",
        "الحديث رقم 42",
        "الحديث رقم 43",
        "الحديث رقم 44",
        "الحديث رقم 45",
        "الحديث رقم 46",
        "الحديث رقم 47",
        "الحديث رقم 48",
        "الحديث رقم 49",
        "الحديث رقم 50",

        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hadeth, container, false)
    }

    lateinit var recycler_hadeth: RecyclerView
    lateinit var adapter: hadethadapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initrecycler()
    }

    private fun initrecycler() {
        recycler_hadeth = requireView().findViewById(R.id.recycler_view_hadeth)
        adapter = hadethadapter(hadethsname)
        adapter.onItemclicklistener = object : hadethadapter.OnItemSelectedListiner {
            override fun onitemclick(pos: Int, name: String) {
                showhadethdetails(pos, name)
            }
        }
        recycler_hadeth.adapter = adapter
    }

    fun showhadethdetails(pos: Int, name: String) {
        val intent = Intent(context, hadeth_details::class.java)
        intent.putExtra(Constants.Etra_hadeth_name, name)
        intent.putExtra(Constants.Extra_hadeth_Pos, pos)
        startActivity(intent)
    }
}