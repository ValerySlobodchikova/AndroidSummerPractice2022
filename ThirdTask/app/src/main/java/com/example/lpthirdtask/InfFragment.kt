package com.example.lpthirdtask

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.lpthirdtask.databinding.FragmentInfBinding

class InfFragment(_id: Int) : Fragment(R.layout.fragment_inf) {
    val cityId: Int

    private var _binding: FragmentInfBinding? = null
    private val binding get() = _binding!!

    init {
        cityId = _id
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfBinding.bind(view)

        with(binding) {
            val city = CityRepository.cities.get(cityId)
            twNameCity.text = city.name
            twPopulation.text = city.population.toString()
            twDescription.text = city.description
            Glide.with(view).load(city.url).into(image)
            button.setOnClickListener {
                val tx = activity?.supportFragmentManager?.beginTransaction()
                tx?.replace(R.id.pupa, CityFragment())
                tx?.disallowAddToBackStack()
                tx?.commit()
            }
        }
    }


}