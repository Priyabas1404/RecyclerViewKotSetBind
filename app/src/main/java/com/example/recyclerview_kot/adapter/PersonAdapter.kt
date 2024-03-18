package com.example.recyclerview_kot.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_kot.databinding.ItemNamesBinding
import com.example.recyclerview_kot.model.Names

class PersonAdapter(private val personNameList: ArrayList<Names>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    lateinit var binding: ItemNamesBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemNamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(personNameList[position])
    }

    override fun getItemCount() = personNameList.size

    class ViewHolder (private val binding: ItemNamesBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(name: Names) {
            binding.name1.text = name.name
            binding.age1.text = name.age.toString()
        }
    }
}