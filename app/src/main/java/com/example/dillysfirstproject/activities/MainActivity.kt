package com.example.dillysfirstproject.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.Observer
import com.example.dillysfirstproject.databinding.MainActivityBinding
import viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private val viewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        observelivedata()

        binding.button1.setOnCheckedChangeListener { chip, isChecked ->
            viewModel.switchCheckBox()

        }

        binding.button2.setOnClickListener {

            binding.button3.setOnClickListener {

            }
        }
    }

    private fun observelivedata() {
        val button1Observer = Observer<Boolean> { isChecked ->
            if (isChecked) {
                binding.button2.visibility = View.GONE
                binding.button3.visibility = View.GONE
            } else {
                binding.button2.visibility = View.VISIBLE
                binding.button3.visibility = View.VISIBLE
            }
        }
        viewModel.button1Checked.observe(this, button1Observer)
    }


}
