package com.example.calculadoraimc

import org.junit.Assert.*
import org.junit.Test

class UtilTest {

    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun testGetImcResult_aviso_embranco() {
        val semPeso = getImcResult("", "1.76")
        assertEquals(semPeso.result, Result.BLANK)
    }
}