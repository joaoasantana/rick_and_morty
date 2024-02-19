package com.joao.santana.character.domain.repository

import com.joao.santana.character.domain.entity.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    suspend fun getAllCharacters() : Flow<List<Character>>
    suspend fun getSingleCharacter(id: Int) : Flow<Character>
}
