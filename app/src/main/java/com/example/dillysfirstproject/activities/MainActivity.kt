package com.example.dillysfirstproject.activities

import android.app.Activity
import android.os.Bundle
import com.example.dillysfirstproject.databinding.MainActivityBinding

class MainActivity : Activity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}





