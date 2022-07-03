package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lpsecondtask.databinding.FragmentClipsBinding
import com.google.android.material.snackbar.Snackbar

class ClipsFragment : Fragment(R.layout.fragment_clips) {
    private var _binding: FragmentClipsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentClipsBinding.bind(view)
        val text = (this.javaClass.name).split(".")[3]
        with(binding) {
            btnClips.setOnClickListener {
                findNavController().navigate(
                    R.id.action_clipsFragment_to_targetFragment,
                    TargetFragment.createBundle(text)
                )
            }
        }
    }
}