package com.example.musikplayer

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.musikplayer.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDataMusicName()
    }

    private fun getDataMusicName() {
        val nameMusic = intent.getStringExtra("nameMusic")
        binding.tvText.text = nameMusic
    }
}