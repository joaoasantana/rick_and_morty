package com.joao.santana.character.domain.interactor

import com.joao.santana.character.domain.entity.Character
import com.joao.santana.character.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetAllCharactersInteractor(
    private val repository: CharacterRepository
) {
    
    suspend operator fun invoke(): Flow<List<Character>> {
        return repository.getAllCharacters()
    }
}
