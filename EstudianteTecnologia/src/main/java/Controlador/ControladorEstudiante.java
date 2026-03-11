/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author jeron
 */

import Modelo.Curso;
import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {

    private Curso curso;
    private VistaEstudiante vista;

    public ControladorEstudiante(Curso curso,
                                 VistaEstudiante vista) {
        this.curso = curso;
        this.vista = vista;
    }

   

    public void registrar(int codigo, String nombre,
                          double notaDesarrollo,
                          double notaMatematica) {

        if (codigo > 21000) {
            curso.agregarEstudiante(
                    new Estudiante(codigo, nombre,
                                   notaDesarrollo,
                                   notaMatematica));
        }
    }

    public void modificarNota(int codigo,
                              double nuevaNota) {

        Estudiante e = curso.buscarPorCodigo(codigo);

        if (e != null) {
            e.setNotaDesarrollo(nuevaNota);
        }
    }

    public void incrementar(double incremento) {
    if (incremento > 0.5) return;
    curso.incrementarDesarrollo(incremento);
}

    public void mostrarOrdenados() {

        curso.ordenarPorDefinitiva();

        for (Estudiante e : curso.getLista()) {
            vista.mostrar(
                    e.getCodigo() + " - " +
                    e.getNombre() + " - " +
                    e.calcularDefinitiva() + " - " +
                    e.estado()
            );
        }
    }

    public void mostrarMayorALimite(double limite) {

        for (Estudiante e : curso.getLista()) {
            if (e.calcularDefinitiva() > limite) {
                vista.mostrar(
                        e.getCodigo() + " - " +
                        e.getNombre() + " - " +
                        e.calcularDefinitiva()
                );
            }
        }
    }

    // 🔹 MENÚ

    public void menu() {

        int opcion;

        do {

      
            vista.mostrar("1. Registrar estudiantes");
            vista.mostrar("2. Mostrar ordenados");
            vista.mostrar("3. Mostrar mayores a límite");
            vista.mostrar("4. Incrementar desarrollo");
            vista.mostrar("5. Modificar nota");
            vista.mostrar("6. Salir");

            opcion = vista.leerOpcion();

            switch (opcion) {

                case 1:
                    int n = vista.leerNumeroEstudiantes();
                    for (int i = 0; i < n; i++) {

                        int codigo = vista.leerCodigo();
                        String nombre = vista.leerNombre();
                        double nd = vista.leerNota("Desarrollo");
                        double nm = vista.leerNota("Matemática");

                        registrar(codigo, nombre, nd, nm);
                    }
                    break;

                case 2:
                    mostrarOrdenados();
                    break;

                case 3:
                    double limite = vista.leerLimite();
                    mostrarMayorALimite(limite);
                    break;

                case 4:
                    double inc = vista.leerIncremento();
                    incrementar(inc);
                    break;

                case 5:
                    int cod = vista.leerCodigo();
                    double nueva = vista.leerNota("Desarrollo");
                    modificarNota(cod, nueva);
                    break;

                case 6:
                    vista.mostrar("Saliendo...");
                    break;

                default:
                    vista.mostrar("Opción inválida.");
            }

        } while (opcion != 6);
    }
}