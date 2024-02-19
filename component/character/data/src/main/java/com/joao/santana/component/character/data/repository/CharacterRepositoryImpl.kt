package com.joao.santana.component.character.data.repository

import com.joao.santana.character.domain.entity.Character
import com.joao.santana.character.domain.repository.CharacterRepository
import com.joao.santana.component.character.data.mapper.CharacterMapper
import com.joao.santana.component.character.data.source.CharacterRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class CharacterRepositoryImpl(
    private val mapper: CharacterMapper,
    private val remoteDataSource: CharacterRemoteDataSource
) : CharacterRepository {

    override suspend fun getAllCharacters(): Flow<List<Character>> {
        return remoteDataSource.getAll()
            .map { response -> response.data.map { mapper.mapToEntity(it) } }
    }

    override suspend fun getSingleCharacter(id: Int): Flow<Character> {
        return remoteDataSource.getById(id)
            .map { response -> mapper.mapToEntity(response) }
    }
}
