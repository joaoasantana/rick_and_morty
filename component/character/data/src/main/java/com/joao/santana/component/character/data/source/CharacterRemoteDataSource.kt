package com.joao.santana.component.character.data.source

import com.joao.santana.component.character.data.model.CharacterDTO
import com.joao.santana.component.character.data.model.CharacterListDTO
import kotlinx.coroutines.flow.Flow

internal interface CharacterRemoteDataSource {

    suspend fun getAll(): Flow<CharacterListDTO>
    suspend fun getById(id: Int): Flow<CharacterDTO>
}
