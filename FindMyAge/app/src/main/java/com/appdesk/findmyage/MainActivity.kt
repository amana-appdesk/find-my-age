package com.appdesk.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appdesk.findmyage.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
         buttonClick()
        }
    }

    fun buttonClick(){
        val userDOB = Integer.parseInt(binding.editTextInput.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYear = currentYear - userDOB
        binding.textViewAge.text = "Your Age is $userAgeInYear Year"
    }
}