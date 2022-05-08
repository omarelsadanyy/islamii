package com.example.new_islamii.ui.Home.fragments.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R

class Surahnameadapter(val items: List<String>) : RecyclerView.Adapter<Surahnameadapter.viewholder>() {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val name: TextView = itemview.findViewById(R.id.chapter_name_label)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chaoter_name, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val surahname = items.get(position)
        holder.name.setText(surahname)
        if (onItemclicklistener != null) {
            holder.itemView.setOnClickListener {
                onItemclicklistener?.onitemclick(position, surahname)
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
  fun nothing() {
    }
}