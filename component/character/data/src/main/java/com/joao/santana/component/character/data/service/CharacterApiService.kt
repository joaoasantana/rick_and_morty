package com.joao.santana.component.character.data.service

import com.joao.santana.component.character.data.model.CharacterDTO
import com.joao.santana.component.character.data.model.CharacterListDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

private const val CHARACTER_API = "character"

internal interface CharacterApiService {

    @GET("$CHARACTER_API/")
    suspend fun getAll(): Response<CharacterListDTO>

    @GET("$CHARACTER_API/{id}")
    suspend fun getById(@Path("id") id: Int): Response<CharacterDTO>
}
