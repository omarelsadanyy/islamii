package com.example.new_islamii.ui.hadethDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.new_islamii.R

class hadeth_detailsadapter : RecyclerView.Adapter<hadeth_detailsadapter.viewholder>() {

    var items: List<String>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hadethh, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val content: String? = items?.get(position)
        holder.content.setText(content)
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0;
    }

    fun changedata(hadeth_content: List<String>) {
        this.items = hadeth_content
        notifyDataSetChanged()
    }

    class viewholder(Itemview: View) : RecyclerView.ViewHolder(Itemview) {
        val content: TextView = Itemview.findViewById(R.id.contentt1)
    }
}