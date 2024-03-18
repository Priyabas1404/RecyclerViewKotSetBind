package com.example.recyclerview_kot.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_kot.databinding.ItemNamesBinding
import com.example.recyclerview_kot.model.Names
import androidx.databinding.library.baseAdapters.BR

class PersonAdapter(private val personNameList: ArrayList<Names>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    lateinit var binding: ItemNamesBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemNamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.setVariable(BR.namesModel, personNameList[position])
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = personNameList.size

    class ViewHolder (val binding: ItemNamesBinding) : RecyclerView.ViewHolder(binding.root){
    }
}