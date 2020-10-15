package com.example.ithisanimator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter() : RecyclerView.Adapter<MyAdapter.ListHolder>() {
    var list = listOf<String>()

    class ListHolder(item: View) : RecyclerView.ViewHolder(item) {
        val text = item.findViewById<TextView>(R.id.tv_rv_main)
    }

    fun setData(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return ListHolder(view)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        val src = list[position]
        holder.text.text = src
    }

    override fun getItemCount(): Int = list.size
}