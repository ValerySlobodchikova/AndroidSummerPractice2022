package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lpsecondtask.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        val text = (this.javaClass.name).split(".")[3]
        with(binding) {
            btnMain.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_targetFragment,
                    TargetFragment.createBundle(text)
                )
            }
        }
    }
}