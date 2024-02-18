package com.joao.santana.character.domain.repository

import com.joao.santana.character.domain.entity.Character

interface CharacterRepository {

    suspend fun getAllCharacters() : List<Character>
    suspend fun getSingleCharacter(id: Int) : Character
}
