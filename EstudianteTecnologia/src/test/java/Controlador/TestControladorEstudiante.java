/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

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

import Modelo.Curso;
import Modelo.Estudiante;
import Vista.VistaEstudiante;


class ControladorEstudianteTest {

    private Curso curso;
    private VistaEstudiante vista;
    private ControladorEstudiante controlador;

    @BeforeEach
    void setUp() {
        curso = new Curso();
        vista = new VistaEstudiante();
        controlador = new ControladorEstudiante(curso, vista);
    }

    
    @Test
    void testRegistrar() {

        controlador.registrar(22000, "Juan", 4.0, 3.0);

        assertEquals(1, curso.getLista().size());
        assertEquals("Juan", curso.getLista().get(0).getNombre());
    }

    
    @Test
    void testModificarNota() {

        controlador.registrar(22000, "Ana", 3.0, 4.0);
        controlador.modificarNota(22000, 5.0);

        Estudiante e = curso.buscarPorCodigo(22000);

        assertEquals(5.0, e.getNotaDesarrollo());
    }

    
    @Test
    void testIncrementar() {

        controlador.registrar(22000, "Luis", 4.5, 4.0);
        controlador.incrementar(0.5);

        Estudiante e = curso.buscarPorCodigo(22000);

        assertEquals(5.0, e.getNotaDesarrollo());
    }

   
    @Test
    void testMostrarOrdenados() {

        controlador.registrar(22000, "A", 2.0, 2.0);
        controlador.registrar(22001, "B", 5.0, 5.0);

        controlador.mostrarOrdenados();

        assertTrue(
            curso.getLista().get(0).calcularDefinitiva()
            <=
            curso.getLista().get(1).calcularDefinitiva()
        );
    }

  
    @Test
    void testMostrarMayorALimite() {

        controlador.registrar(22000, "Carlos", 5.0, 5.0);
        controlador.registrar(22001, "Mario", 2.0, 2.0);

        controlador.mostrarMayorALimite(3.5);

        assertEquals(2, curso.getLista().size());
    }
}