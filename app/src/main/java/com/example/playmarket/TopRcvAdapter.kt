package com.example.playmarket

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.toprcvitem.view.*

class TopRcvAdapter(var context: Context, var list:MutableList<String>):RecyclerView.Adapter<TopRcvAdapter.VH>() {
    inner class VH(item:View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(R.layout.toprcvitem, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        if (position == 0) {
            holder.itemView.topItemTxt.text = list[position]
        }else{
            holder.itemView.topItemTxt.text = list[position]
            holder.itemView.topItemTxt.setTextColor(Color.GRAY)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}