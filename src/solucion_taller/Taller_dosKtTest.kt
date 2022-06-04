package solucion_taller

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Taller_dosKtTest {

    @Test
    fun area_del_triangulo() {
        assertEquals(2.0,solucion_taller.area_del_triangulo(2.0,2.0))
    }

    @Test
    fun conversion() {
        assertEquals(3.0,solucion_taller.conversion(10500.0,3500.0))
    }
}