package com.example.dillysfirstproject.activities

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.dillysfirstproject.databinding.TwoPlayersBinding

class TwoPlayerActivity : Activity() {
    private lateinit var binding: TwoPlayersBinding
    private var playertwohealth: Int = 40
    private var playeronehealth: Int = 40
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TwoPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plyrTwoLwrBtn.setOnClickListener {
            playertwohealth--
            healthDown(playertwohealth, binding.plyrTwoHthTxt)
        }
        binding.plyrOneLwrBtn.setOnClickListener {
            playeronehealth--
            healthDown(playeronehealth, binding.plyrOneHthTxt)
        }

        binding.plyrTwoHgrBtn.setOnClickListener {
            playertwohealth++
            healthUp(playertwohealth, binding.plyrTwoHthTxt)
        }
        binding.plyrOneHgrBtn.setOnClickListener {
            playeronehealth++
            healthUp(playeronehealth, binding.plyrOneHthTxt) }

    }

    private fun healthDown(health: Int, healthToChange: TextView) {
        healthToChange.text = health.toString()
    }

    private fun healthUp(health: Int, healthToChange: TextView) {
        healthToChange.text = health.toString()

    }

}