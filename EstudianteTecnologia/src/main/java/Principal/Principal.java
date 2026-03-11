/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

/**
 *
 * @author jeron
 */

import Modelo.Curso;
import Vista.VistaEstudiante;
import Controlador.ControladorEstudiante;

public class Principal {

    public static void main(String[] args) {

        Curso curso = new Curso();
        VistaEstudiante vista = new VistaEstudiante();

        ControladorEstudiante controlador =
                new ControladorEstudiante(curso, vista);

        controlador.menu();
    }
}
