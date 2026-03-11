/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jeron
 */


public class EstudianteTest {

    @Test
    public void testCalcularDefinitiva() {

        Estudiante e = new Estudiante(22000, "Juan", 4.0, 3.0);

        double definitiva = e.calcularDefinitiva();

        assertEquals(3.55, definitiva, 0.01);
    }

    @Test
    public void testAprueba() {

        Estudiante e = new Estudiante(22001, "Maria", 4.5, 4.0);

        assertEquals("SI APRUEBA", e.estado());
    }

    @Test
    public void testNoAprueba() {

        Estudiante e = new Estudiante(22002, "Pedro", 2.0, 3.0);

        assertEquals("NO APRUEBA", e.estado());
    }

    @Test
    public void testSetNotaDesarrollo() {

        Estudiante e = new Estudiante(22003, "Ana", 3.0, 3.0);

        e.setNotaDesarrollo(4.2);

        assertEquals(4.2, e.getNotaDesarrollo());
    }
}
