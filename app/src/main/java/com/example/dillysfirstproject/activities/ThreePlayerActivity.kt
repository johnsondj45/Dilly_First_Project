package com.example.dillysfirstproject.activities

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.dillysfirstproject.databinding.ThreePlayersBinding

class ThreePlayerActivity : Activity() {
    private lateinit var binding: ThreePlayersBinding
    private var playertwohealth: Int = 40
    private var playeronehealth: Int = 40
    private var playerthreehealth: Int = 40
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThreePlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            plyrThreeLwrBtn.setOnClickListener {
                //Player Three = Green
                playerthreehealth--
                healthDown(playerthreehealth, binding.plyrThreeHthTxt)
            }
            plyrTwoLwrBtn.setOnClickListener {
                //Player Two = Blue
                playertwohealth--
                healthDown(playertwohealth, binding.plyrTwoHthTxt)
            }
            plyrOneLwrBtn.setOnClickListener {
                //Player One = Red
                playeronehealth--
                healthDown(playeronehealth, binding.plyrOneHthTxt)
            }
            plyrThreeHgrBtn.setOnClickListener {
                playerthreehealth++
                healthUp(playerthreehealth, binding.plyrThreeHthTxt)
            }

            plyrTwoHgrBtn.setOnClickListener {
                playertwohealth++
                healthUp(playertwohealth, binding.plyrTwoHthTxt)
            }
            plyrOneHgrBtn.setOnClickListener {
                playeronehealth++
                healthUp(playeronehealth, binding.plyrOneHthTxt)
            }
        }


    }

    private fun healthDown(health: Int, healthToChange: TextView) {
        healthToChange.text = health.toString()
    }

    private fun healthUp(health: Int, healthToChange: TextView) {
        healthToChange.text = health.toString()
    }
}