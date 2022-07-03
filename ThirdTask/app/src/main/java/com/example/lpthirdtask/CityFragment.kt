package com.example.lpthirdtask

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lpthirdtask.databinding.FragmentCityBinding

class CityFragment : Fragment(R.layout.fragment_city) {

    private var _binding: FragmentCityBinding? = null
    private val binding get() = _binding!!

    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCityBinding.bind(view)

        adapter = CityAdapter(CityRepository.cities) {
            val tx = activity?.supportFragmentManager?.beginTransaction()
            tx?.replace(R.id.pupa, InfFragment(it.id))
            tx?.disallowAddToBackStack()
            tx?.commit()
        }
        binding.rvCity.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun fragment() {

    }

}