package com.joao.santana.character.domain.entity

import com.joao.santana.character.domain.enums.Gender
import com.joao.santana.character.domain.enums.Status

data class Character(
    val id: Int,
    val name: String,
    val status: Status,
    val species: String,
    val type: String,
    val gender: Gender,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String,
)
