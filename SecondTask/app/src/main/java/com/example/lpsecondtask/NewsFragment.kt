package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.provider.Settings.Global.putString
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lpsecondtask.databinding.FragmentNewsBinding
import com.google.android.material.snackbar.Snackbar

class NewsFragment : Fragment(R.layout.fragment_news) {
    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNewsBinding.bind(view)
        val text = (this.javaClass.name).split(".")[3]
        with(binding) {
            btnNews.setOnClickListener {
                findNavController().navigate(
                    R.id.action_newsFragment_to_targetFragment,
                    TargetFragment.createBundle(text)
                )
            }
        }
    }
}