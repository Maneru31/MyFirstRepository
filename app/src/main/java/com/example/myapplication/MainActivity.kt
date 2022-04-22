package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        var count = 0
        binding.add.setOnClickListener{
            count ++

            binding.count.text = count.toString()
        }
        binding.remove.setOnClickListener{
            count--

            binding.count.text = count.toString()
        }
    }
}