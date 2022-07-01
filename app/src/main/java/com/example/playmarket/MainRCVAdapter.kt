package com.example.playmarket

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.innerrcv.view.*

class MainRCVAdapter(var context: Context, var list: MutableList<RCVItem>):RecyclerView.Adapter<MainRCVAdapter.VH>() {
    inner class VH(var item:View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(R.layout.innerrcv, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.innerRcvTxt.text = list[position].string
        holder.itemView.innerRcvRcv.adapter = list[position].rcv!!.adapter
    }

    override fun getItemCount(): Int {
        return list.size
    }
}