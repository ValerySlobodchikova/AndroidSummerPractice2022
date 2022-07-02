package com.example.lpsecondtask

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class TargetFragment : Fragment(R.layout.fragment_target) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(KEY).orEmpty()
        if (!text.isEmpty())
            Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
    }

    companion object {
        private val KEY = "temp_key"
        fun createBundle(text: String): Bundle {
            var bundle = Bundle()
            bundle.putString(KEY, text)
            return bundle
        }
    }
}