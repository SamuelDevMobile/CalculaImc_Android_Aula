package com.example.calculadoraimc

import org.junit.Assert.*
import org.junit.Test

class UtilTest {

    @Test
    fun `testGetImcResult_90_180_sobrepeso`() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun `testGetImcResult_aviso_embranco`() {
        val semPeso = getImcResult("", "1.76")
        assertEquals(semPeso.result, Result.BLANK)

        val semAltura = getImcResult("67", "")
        assertEquals(semAltura.result, Result.BLANK)
    }

    @Test
    fun `testaGetImcResult_67_176_saudavel`() {
        val imcSaudavel = getImcResult("67", "1.76")
        assertEquals(imcSaudavel.result, Result.OK)
    }
}