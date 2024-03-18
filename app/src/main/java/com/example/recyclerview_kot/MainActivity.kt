package com.example.recyclerview_kot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_kot.adapter.PersonAdapter
import com.example.recyclerview_kot.databinding.ActivityMainBinding
import com.example.recyclerview_kot.model.Names

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name_age1 = Names(getString(R.string.name1), "31")
        val name_age2 = Names(getString(R.string.name2), "35")
        val name_age3 = Names(getString(R.string.name3), "39")

        val personList = arrayListOf(name_age1, name_age2, name_age3)

        adapter = PersonAdapter(personList)

        with(binding){
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}