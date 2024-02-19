package com.joao.santana.component.character.data.source

import com.joao.santana.component.character.data.model.CharacterDTO
import com.joao.santana.component.character.data.model.CharacterListDTO
import com.joao.santana.component.character.data.service.CharacterApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class CharacterRemoteDataSourceImpl(
    private val apiService: CharacterApiService
) : CharacterRemoteDataSource {

    override suspend fun getAll(): Flow<CharacterListDTO> = flow {
        val response = apiService.getAll()
        emit(response.body() ?: throw Exception(response.message()))
    }

    override suspend fun getById(id: Int): Flow<CharacterDTO> = flow {
        val response = apiService.getById(id)
        emit(response.body() ?: throw Exception(response.message()))
    }
}
