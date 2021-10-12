package com.ae.rickandmortygraphql.dto

data class CharacterResponse(
   val __typename: String = "Character",
   val id: String = "",
   val name: String = "",
   val species: String = ""
)
