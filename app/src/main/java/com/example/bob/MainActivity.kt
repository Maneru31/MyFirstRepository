package com.example.bob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.recycler.adapter = MainRecyclerAdapter()
//        binding.recycler.layoutManager = LinearLayoutManager(R.layout.activity_main)


        binding.buttonNavigation.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(binding.fragment.id, FirstFragment()).commit()
                }

                R.id.message -> {
                    supportFragmentManager.beginTransaction().replace(binding.fragment.id, SecondFragment()).commit()
                }

                R.id.search -> {
                    supportFragmentManager.beginTransaction().replace(binding.fragment.id, ThreeFragment()).commit()
                }

                R.id.more -> {
                    supportFragmentManager.beginTransaction().replace(binding.fragment.id, FourFragment()).commit()
                }


            }


            true
        }


    }
}