package com.example.lpthirdtask

import androidx.recyclerview.widget.RecyclerView
import com.example.lpthirdtask.databinding.ItemCityBinding

class CityHolder(private val binding: ItemCityBinding, private val onItemClick: (City) -> Unit) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(city : City) {
        with(binding) {
            tvName.text = city.name
            root.setOnClickListener {
                onItemClick(city)
            }
            //Glide.with(binding.root).load(city.url).into()
        }
    }
}