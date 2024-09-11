package com.example.dillysfirstproject.activities

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.dillysfirstproject.databinding.FourPlayersBinding

class FourPlayerActivity : Activity() {
    private lateinit var binding: FourPlayersBinding
    private var playertwohealth: Int = 40
    private var playeronehealth: Int = 40
    private var playerthreehealth: Int = 40
    private var playerfourhealth: Int = 40
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FourPlayersBinding.inflate(layoutInflater)
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
            plyrFourLwrBtn.setOnClickListener {
                //Player Four = Orange
                playerfourhealth--
                healthDown(playerfourhealth, binding.plyrFourHthTxt)
            }
            plyrFourHgrBtn.setOnClickListener {
                playerfourhealth++
                healthUp(playerfourhealth, binding.plyrFourHthTxt)
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