package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.first.databinding.ActivityMainBinding
import com.example.first.databinding.ActivitySecondBinding
import java.util.*

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    companion object {
        const val COUNT = "this_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val randomNumber = binding.textRandom
        val text = binding.textLabel
        val count = intent.getIntExtra(COUNT, 0)

        text.text = getString(R.string.random_label, count)
        val rnds = (0..count).random()
        randomNumber.text = rnds.toString()


    }

}