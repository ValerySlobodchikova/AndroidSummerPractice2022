package com.example.lpthirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tx = supportFragmentManager.beginTransaction()
        tx.replace(R.id.pupa, CityFragment())
        tx.disallowAddToBackStack()
        tx.commit()
    }
}