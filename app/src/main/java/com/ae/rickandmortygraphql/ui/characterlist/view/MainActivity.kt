package com.ae.rickandmortygraphql.ui.characterlist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.ae.rickandmortygraphql.databinding.ActivityMainBinding
import com.ae.rickandmortygraphql.ui.characterlist.viewmodel.RickAndMortyListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: RickAndMortyListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getResponse()
    }

    private fun getResponse() {
        viewModel.getList().observe(this, Observer {
        })
    }
}