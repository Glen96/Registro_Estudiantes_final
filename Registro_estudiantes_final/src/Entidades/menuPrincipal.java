package Entidades;

import javax.swing.JOptionPane;

public class menuPrincipal {

    public Universidad universidad1 = new Universidad();

    // metodo para trabajar el menu principal
    public void llamarMenu() {
        int opc = Integer
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

}
