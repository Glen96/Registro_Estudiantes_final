package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Matriculable;
import Interfaces.Pagable;
import Interfaces.Retirable;

//se crea la herencia de la clase entidad y se utilizan las interfaces Matriculable, Retirable, Pagable
public class Estudiante extends Entidad implements Matriculable, Retirable, Pagable {

    protected int idEstudiante, deuda;
    protected Aula aulaEstudiante;
    private int opc;
    private matriculaXestudiante mXe = new matriculaXestudiante();
    private menuPrincipal menuPrincipal = new menuPrincipal();

    // Se crea el metodo Llamar Menu Estudiante, el cual sera el menu del apartado
    // Estudiante
    protected void LlamarMenuEstudiante() {
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

    // Se crea el metodo Matricular el cual proviene de la clase Matriculable
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
            LlamarMenuEstudiante();
            break;
        case 2:
            if(mXe.buscarestudiante()== true){
                
            }
            break;
        }
    }

    // Se crea el metodo Pagar el cual proviene de la clase Pagable
    @Override
    public void Pagar() {
        if (mXe.buscarestudiante() == true) {
            int deuda = 500000;
            JOptionPane.showMessageDialog(null, "El estudiante tiene un monto a pagar de: " + deuda);
            int montoPagar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a pagar:"));
            deuda = deuda - montoPagar;
            if (deuda == 0) {
                JOptionPane.showMessageDialog(null, "El estudiante se encuentra al dia");
            } else {
                JOptionPane.showMessageDialog(null, "El estudiante tiene un monto por cancelar de: " + deuda);
            }
        }
    }

    // Se crea el metodo Retirar el cual proviene de la clase Retirable
    @Override
    public void Retirar() {

    }

    public Aula getAulaEstudiante() {
        return aulaEstudiante;
    }

    public void setAulaEstudiante(Aula aulaEstudiante) {
        this.aulaEstudiante = aulaEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

}
