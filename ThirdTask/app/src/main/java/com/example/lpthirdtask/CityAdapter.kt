package com.example.lpthirdtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lpthirdtask.databinding.ItemCityBinding

class CityAdapter(
    private val list :List<City>,
    private val onItemClick: (City) -> Unit
) : RecyclerView.Adapter<CityHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityHolder =
        CityHolder(binding = ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false), onItemClick)

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}