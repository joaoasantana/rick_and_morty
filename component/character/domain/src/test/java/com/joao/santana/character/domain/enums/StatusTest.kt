package com.joao.santana.character.domain.enums

import org.junit.Test

internal class StatusTest {

    @Test
    fun `when Alive status should return ALIVE`() {
        val value = "Alive"
        assert(Status.valueOf(value.uppercase()) == Status.ALIVE)
    }

    @Test
    fun `when Dead status should return DEAD`() {
        val value = "Dead"
        assert(Status.valueOf(value.uppercase()) == Status.DEAD)
    }

    @Test
    fun `when Unknown status should return UNKNOWN`() {
        val value = "Unknown"
        assert(Status.valueOf(value.uppercase()) == Status.UNKNOWN)
    }
}
