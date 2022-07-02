package com.example.lpsecondtask

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pref = activity?.getSharedPreferences("TEST", Context.MODE_PRIVATE) ?: return
        val value = pref.getString("PREF_TEXT", "").orEmpty()
        val text = (this.javaClass.name).split(".")[3]
        pref.edit {
            putString("PREF_TEXT", text)
            commit()
        }

        if (!value.isEmpty())
            Snackbar.make(view, value, Snackbar.LENGTH_SHORT).show()
    }
}