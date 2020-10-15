package com.example.ithisanimator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_motion.*

class MainActivity : AppCompatActivity() {
val name= mutableListOf<String>("Rome","Kiev","Mosskov","New York","Berlin","Astana","Baku")
    lateinit var myadapter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)
        myadapter= MyAdapter()
        myadapter.setData(name)
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = myadapter
        rv_main.addItemDecoration(DividerItemDecoration(this, HORIZONTAL))
       ItemTouchHelper(itensimple).attachToRecyclerView(rv_main)

    }
    var itensimple=object :ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT or ItemTouchHelper.LEFT or ItemTouchHelper.DOWN){
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean =true

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            name.removeAt(viewHolder.adapterPosition)
            myadapter.notifyDataSetChanged()
        }

    }
}