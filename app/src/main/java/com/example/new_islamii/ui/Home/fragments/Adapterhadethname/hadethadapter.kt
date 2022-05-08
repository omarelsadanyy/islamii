package com.example.new_islamii.ui.Home.fragments.Adapterhadethname

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R

class hadethadapter(val items: List<String>) : RecyclerView.Adapter<hadethadapter.viewholDer>() {
    class viewholDer(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val name: TextView = itemview.findViewById(R.id.hadeth_name_label)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholDer {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hadeth_name, parent, false)
        return viewholDer(view)
    }

    override fun onBindViewHolder(holder: viewholDer, position: Int) {
        val hadethname = items.get(position)
        holder.name.setText(hadethname)
        if (onItemclicklistener != null) {
            holder.itemView.setOnClickListener {
                onItemclicklistener?.onitemclick(position, hadethname)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface OnItemSelectedListiner {
        fun onitemclick(pos: Int, name: String) {

        }
    }

    var onItemclicklistener: OnItemSelectedListiner? = null
}