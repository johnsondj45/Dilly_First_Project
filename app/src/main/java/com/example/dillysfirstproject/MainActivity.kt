package com.example.dillysfirstproject

import android.app.Activity
import android.os.Bundle
import com.example.dillysfirstproject.databinding.MainActivityBinding

class MainActivity : Activity() {

    private lateinit var binding: MainActivityBinding
    var newText = "This String Has Been Updated."
    var secondNewText = "New String,"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onResume() {
        super.onResume()
    }

    fun setUpUserInterface() {
        binding.firstbutton.setOnClickListener{
            updateText()
        }
    }

    private fun updateText() {
        binding.newText.text = (newText)
    }


}





