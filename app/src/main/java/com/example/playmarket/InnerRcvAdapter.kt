package com.example.playmarket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.inneritem.view.*

class InnerRcvAdapter(var context: Context, var list: MutableList<InnerItem>):RecyclerView.Adapter<InnerRcvAdapter.VH>() {
    inner class VH(item:View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(R.layout.inneritem, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        Picasso.get().load(list[position].picture).into(holder.itemView.innerImage)
        Picasso.get().load(list[position].logo).into(holder.itemView.innerLogo)
        holder.itemView.itemName.text = list[position].name
        holder.itemView.itemMemo.text = list[position].memory
        holder.itemView.itemScore.text = list[position].score
        holder.itemView.itemType.text = list[position].type
    }

    override fun getItemCount(): Int {
        return list.size
    }
}