package com.joao.santana.character.domain.interactor

import com.joao.santana.character.domain.entity.Character
import com.joao.santana.character.domain.repository.CharacterRepository

class GetSingleCharacterInteractor(
    private val repository: CharacterRepository
) {

    suspend operator fun invoke(id: Int): Character {
        return repository.getSingleCharacter(id)
    }
}
