package com.ae.rickandmortygraphql.core.di.module

import com.apollographql.apollo.ApolloClient
import okhttp3.OkHttpClient
import org.koin.dsl.module

val apiModule = module {

    // Provide ApolloClient
    single<ApolloClient> {
        ApolloClient.builder()
            .serverUrl("https://rickandmortyapi.com/graphql")
            .okHttpClient(get())
            .build()
    }

    // Provide OkHttpClient
    single<OkHttpClient> { OkHttpClient.Builder().build() }
}