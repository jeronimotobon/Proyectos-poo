/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author jeron
 */

import java.util.Scanner;

public class VistaEstudiante {

    private Scanner sc = new Scanner(System.in);

    public int leerOpcion() {
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public int leerNumeroEstudiantes() {
        System.out.print("Número de estudiantes: ");
        return sc.nextInt();
    }

    public int leerCodigo() {
        System.out.print("Código (>21000): ");
        return sc.nextInt();
    }

    public String leerNombre() {
        sc.nextLine();
        System.out.print("Nombre: ");
        return sc.nextLine();
    }

    public double leerNota(String materia) {
        System.out.print("Nota " + materia + ": ");
        return Double.parseDouble(sc.next().replace(",", "."));
    }

    public double leerLimite() {
        System.out.print("Nota límite (0.0-5.0): ");
        return Double.parseDouble(sc.next().replace(",", "."));
    }

    public double leerIncremento() {
        System.out.print("Incremento (0.0-0.5): ");
        return Double.parseDouble(sc.next().replace(",", "."));
    }

    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
