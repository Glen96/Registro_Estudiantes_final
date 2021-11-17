package Entidades;

import javax.swing.JOptionPane;

public class menuPrincipal {

    public Universidad universidad1 = new Universidad();
    int opc;

    // metodo para trabajar el menu principal
    public void llamarMenu() {
        opc = Integer
                .parseInt(JOptionPane.showInputDialog(null, "!Bienvenido!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad\n" + "0. Salir\n"));
        switch (opc) {
        case 1:
            int opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "!Modulo Estudiantes!\n"
                    + "Por favor elija la opcion que desea\n" + "1. Matricular\n" + "2. Pagar\n" + "3. Retirar\n"));
            if (opc2 == 1) {
                universidad1.getMatricula().nuevoestudiante();
            } else if (opc2 == 2) {

            }
            break;
        case 2:
            int opc3 = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "!Modulo Universidad!\n" + "Por favor elija la opcion que desea\n"
                            + "1. Buscar Estudiante\n" + "2. Mostrar Estudiante\n" + "3. Retirar\n"));
            if (opc3 == 1) {
                universidad1.getMatricula().buscarestudiante();
            } else if (opc3 == 2) {
                JOptionPane.showMessageDialog(null, universidad1.getMatricula().mostrarEstudiante());
            }
            break;
        default:
            break;
        }
    }

    public void llamarMenuPrincipal() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "!Bienvenido a la Universidad los Patitos!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad\n" + "3. Consultas a Profesores\n"
                        + "4. Salir"));

        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta", "Opcion Invalida",
                    JOptionPane.ERROR_MESSAGE);
            llamarMenuPrincipal();
            break;
        case 1:
            Estudiante estudiante = new Estudiante();
            estudiante.LlamarMenuEstudiante();
            break;
        case 2:
            Universidad universidad = new Universidad();
            universidad.LlamarMenuUniversidad();
            break;
        case 3:
            Profesor profesor = new Profesor();
            profesor.LlamarMenuProfesor();
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema", "Saliendo",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            break;
        }
    }

}
