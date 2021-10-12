package com.ae.rickandmortygraphql.ui.characterlist.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.ae.rickandmortyschema.CharactersListQuery
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class RickAndMortyListViewModel @Inject constructor(
    private val api: ApolloClient
): ViewModel() {

    fun getList(): LiveData<Response<CharactersListQuery.Data>> = liveData {
        val response = api.query(CharactersListQuery()).await()
        emit(response)
    }

}