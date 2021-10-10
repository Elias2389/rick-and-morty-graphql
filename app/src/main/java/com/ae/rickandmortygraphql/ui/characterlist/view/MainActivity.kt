package com.ae.rickandmortygraphql.ui.characterlist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ae.rickandmortygraphql.R
import com.ae.rickandmortygraphql.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}