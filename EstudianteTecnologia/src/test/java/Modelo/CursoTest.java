/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void testAgregarEstudiante() {

        Curso curso = new Curso();

        curso.agregarEstudiante(
                new Estudiante(22000, "Juan", 4.0, 3.0)
        );

        assertEquals(1, curso.getLista().size());
    }

    @Test
    public void testBuscarPorCodigo() {

        Curso curso = new Curso();
        Estudiante e = new Estudiante(22001, "Maria", 4.0, 4.0);

        curso.agregarEstudiante(e);

        Estudiante encontrado = curso.buscarPorCodigo(22001);

        assertNotNull(encontrado);
        assertEquals("Maria", encontrado.getNombre());
    }

    @Test
    public void testIncrementarDesarrolloSinPasar5() {

        Curso curso = new Curso();
        Estudiante e = new Estudiante(22002, "Jero", 4.8, 3.0);

        curso.agregarEstudiante(e);

        curso.incrementarDesarrollo(0.5);

       
        assertEquals(5.0, e.getNotaDesarrollo());
    }

    @Test
    public void testOrdenarPorDefinitivaBurbuja() {

        Curso curso = new Curso();

        Estudiante bajo = new Estudiante(22003, "A", 2.0, 2.0); // definitiva baja
        Estudiante alto = new Estudiante(22004, "B", 5.0, 5.0); // definitiva alta

        curso.agregarEstudiante(alto);
        curso.agregarEstudiante(bajo);

        curso.ordenarPorDefinitiva();
        assertEquals(22003, curso.getLista().get(0).getCodigo());
    }
}
