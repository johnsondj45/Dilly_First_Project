package com.example.dillysfirstproject.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.dillysfirstproject.databinding.MainActivityBinding

class MainActivity : Activity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button1.setOnClickListener {
            val intent = Intent(this, TwoPlayerActivity::class.java)
            startActivity(intent)
        }
    }
}





