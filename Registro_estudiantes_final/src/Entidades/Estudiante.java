package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Matriculable;

public class Estudiante extends Entidad implements Matriculable {

    protected int idEstudiante;
    protected Aula aulaEstudiante;
    private int opc = 0;
    private matriculaXestudiante mXe = new matriculaXestudiante();

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
            break;

        }
    }

    public Aula getAulaEstudiante() {
        return aulaEstudiante;
    }

    public void setAulaEstudiante(Aula aulaEstudiante) {
        this.aulaEstudiante = aulaEstudiante;
    }

}
