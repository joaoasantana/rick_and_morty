package com.joao.santana.component.character.data.mapper

import com.joao.santana.character.domain.entity.Character
import com.joao.santana.character.domain.enums.Gender
import com.joao.santana.character.domain.enums.Status
import com.joao.santana.component.character.data.model.CharacterDTO

internal class CharacterMapper {

    fun mapToEntity(character: CharacterDTO): Character {
        return Character(
            character.id,
            character.name,
            Status.valueOf(character.status.uppercase()),
            character.species,
            character.type,
            Gender.valueOf(character.gender.uppercase()),
            character.image,
            character.episode,
            character.url,
            character.created
        )
    }
}
