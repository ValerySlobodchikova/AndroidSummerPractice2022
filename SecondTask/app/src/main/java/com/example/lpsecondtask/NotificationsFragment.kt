package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lpsecondtask.databinding.FragmentClipsBinding
import com.example.lpsecondtask.databinding.FragmentNotificationsBinding
import com.google.android.material.snackbar.Snackbar

class NotificationsFragment : Fragment(R.layout.fragment_notifications) {
    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNotificationsBinding.bind(view)
        val text = (this.javaClass.name).split(".")[3]
        with(binding) {
            btnNotifications.setOnClickListener {
                findNavController().navigate(
                    R.id.action_notificationsFragment_to_targetFragment,
                    TargetFragment.createBundle(text)
                )
            }
        }
    }
}