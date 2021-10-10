package com.ae.rickandmortygraphql.ui.characterlist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ae.rickandmortygraphql.R
import com.ae.rickandmortygraphql.databinding.ActivityMainBinding
import com.ae.rickandmortygraphql.ui.characterlist.viewmodel.RickAndMortyListViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: RickAndMortyListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}