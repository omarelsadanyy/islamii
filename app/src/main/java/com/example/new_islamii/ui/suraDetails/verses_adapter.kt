package com.example.new_islamii.ui.suraDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R

class verses_adapter : RecyclerView.Adapter<verses_adapter.viewholder>() {
    var items: List<String>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_verse, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val content: String? = items?.get(position)
        holder.content.setText(content)
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0;
    }

    fun changedata(verse: List<String>) {
        this.items = verse
        notifyDataSetChanged()
    }

    class viewholder(Itemview: View) : RecyclerView.ViewHolder(Itemview) {
        val content: TextView = Itemview.findViewById(R.id.contentt)
    }

}