package com.example.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


internal class RcView(view: View) : RecyclerView.ViewHolder(view) {
    var tvName: TextView = view.findViewById<View>(R.id.name) as TextView
}

class RecyclerviewAdapter(val items : ArrayList<Data>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)

        return  RcView(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val vaultItemHolder = holder as RcView
        vaultItemHolder.tvName.text = items.get(position).getTitle()

    }

}