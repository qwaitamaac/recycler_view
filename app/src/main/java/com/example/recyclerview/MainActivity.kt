package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val animals: ArrayList<String> = ArrayList()
    private val data = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var view : RecyclerView = findViewById<RecyclerView>(R.id.rc_view)
        addAnimals()
        view.layoutManager = LinearLayoutManager(this)
        data()
        view.adapter = RecyclerviewAdapter(data)
    }

    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
    }

    private fun data(){
        var addData = Data("Mad Max: Fury Road", false )
        data.add(addData)
        addData = Data("Inside Out", false )
        data.add(addData)
        addData = Data("Star Wars: Episode VII - The Force Awakens", false )
        data.add(addData)
        addData = Data("Shaun the Sheep", false )
        data.add(addData)
        addData = Data("The Martian", false )
        data.add(addData)
        addData = Data("Mission: Impossible Rogue Nation", false )
        data.add(addData)
    }
}