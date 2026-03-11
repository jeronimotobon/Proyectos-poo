/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jeron
 */


import java.util.ArrayList;

public class Curso {

    private ArrayList<Estudiante> lista = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        lista.add(e);
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    // Ordenamiento burbuja ascendente
    public void ordenarPorDefinitiva() {

        for (int i = 0; i < lista.size() - 1; i++) {

            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).calcularDefinitiva() >
                        lista.get(j + 1).calcularDefinitiva()) {

                    Estudiante temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public void incrementarDesarrollo(double incremento) {

        for (Estudiante e : lista) {

            double nueva = e.getNotaDesarrollo() + incremento;

            if (nueva > 5.0) {
                nueva = 5.0;
            }

            e.setNotaDesarrollo(nueva);
        }
    }

    public Estudiante buscarPorCodigo(int codigo) {

        for (Estudiante e : lista) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }
}
