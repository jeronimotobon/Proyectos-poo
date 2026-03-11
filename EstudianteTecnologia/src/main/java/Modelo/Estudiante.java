/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jeron
 */

public class Estudiante {

    private int codigo;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;

    public Estudiante(int codigo, String nombre,
                      double notaDesarrollo,
                      double notaMatematica) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getNotaDesarrollo() { return notaDesarrollo; }
    public double getNotaMatematica() { return notaMatematica; }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public double calcularDefinitiva() {
        return (notaDesarrollo * 0.55) + (notaMatematica * 0.45);
    }

    public String estado() {
        return calcularDefinitiva() >= 3.5
                ? "SI APRUEBA"
                : "NO APRUEBA";
    }
}
