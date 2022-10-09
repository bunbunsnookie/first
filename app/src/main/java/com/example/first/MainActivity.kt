package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.first.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.button
        val textView = binding.textView
        val random = binding.button2


        button.setOnClickListener {
            count++
            textView.text = count.toString()
        }

        random.setOnClickListener{
            val randomIntent = Intent(this,SecondActivity::class.java)

            val count = Integer.parseInt(textView.text.toString())

            randomIntent.putExtra(SecondActivity.COUNT, count)

            startActivity(randomIntent)
        }

    }


}