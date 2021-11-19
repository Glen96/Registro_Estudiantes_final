package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Matriculable;
import Interfaces.Pagable;
import Interfaces.Retirable;
//
public class Estudiante extends Entidad implements Matriculable, Retirable, Pagable {

    protected int idEstudiante;
    protected Aula aulaEstudiante;
    private int opc;
    private matriculaXestudiante mXe = new matriculaXestudiante();
    private menuPrincipal menuPrincipal = new menuPrincipal();

    public void LlamarMenuEstudiante() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "!Modulo Estudiantes!\n"
                + "Por favor elija la opcion que desea\n" + "1. Matricular\n" + "2. Pagar\n" + "3. Retirar\n"));
        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta", "Opcion Invalida",
                    JOptionPane.ERROR_MESSAGE);
            LlamarMenuEstudiante();
            break;
        case 1:
            Matricular();
            break;
        case 2:
            Pagar();
            break;
        case 3:
            Retirar();
            break;
        case 4:
            
            menuPrincipal.llamarMenuPrincipal();
            break;
        }
    }

    @Override
    public void Matricular() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al registro de matricula,\n" + "1. Estudiante primer ingreso\n" + "2. Estudiante regular"));
        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta");
            Matricular();
            break;
        case 1:
            mXe.nuevoestudiante();
            menuPrincipal.llamarMenuPrincipal();
            break;

        }
    }

    @Override
    public void Pagar() {
        

    }

    @Override
    public void Retirar() {
        

    }

    public Aula getAulaEstudiante() {
        return aulaEstudiante;
    }

    public void setAulaEstudiante(Aula aulaEstudiante) {
        this.aulaEstudiante = aulaEstudiante;
    }
}
