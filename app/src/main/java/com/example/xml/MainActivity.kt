package com.example.xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rv)

        var students: List<StudentData>?


        try {
            val parser = XMLPullParser()
            val istream = assets.open("students.xml")
            students=  parser.parse(istream)

            recyclerView.adapter = RV(students)
            recyclerView.layoutManager = LinearLayoutManager(this)

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}