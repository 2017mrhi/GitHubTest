package com.mrhi2024.githubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrhi2024.githubtest.R
import com.mrhi2024.githubtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}