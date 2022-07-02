package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lpsecondtask.databinding.FragmentClipsBinding
import com.example.lpsecondtask.databinding.FragmentSearchBinding
import com.google.android.material.snackbar.Snackbar

class SearchFragment : Fragment(R.layout.fragment_search) {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSearchBinding.bind(view)
        val text = (this.javaClass.name).split(".")[3]
        with(binding) {
            btnSearch.setOnClickListener {
                findNavController().navigate(
                    R.id.action_searchFragment_to_targetFragment,
                    TargetFragment.createBundle(text)
                )
            }
        }
    }
}
