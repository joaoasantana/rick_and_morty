package com.joao.santana.character.domain.enums

import org.junit.Test

internal class GenderTest {
    
    @Test
    fun `when Female gender should return FEMALE`() {
        val value = "Female"
        assert(Gender.valueOf(value.uppercase()) == Gender.FEMALE)
    }

    @Test
    fun `when Male gender should return MALE`() {
        val value = "Male"
        assert(Gender.valueOf(value.uppercase()) == Gender.MALE)
    }

    @Test
    fun `when Genderless gender should return GENDERLESS`() {
        val value = "Genderless"
        assert(Gender.valueOf(value.uppercase()) == Gender.GENDERLESS)
    }

    @Test
    fun `when Unknown gender should return UNKNOWN`() {
        val value = "Unknown"
        assert(Gender.valueOf(value.uppercase()) == Gender.UNKNOWN)
    }
}
