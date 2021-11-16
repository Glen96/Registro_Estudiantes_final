package Entidades;

import javax.swing.JOptionPane;

import Interfaces.Matriculable;

public class Estudiante implements Matriculable {

    protected int idEstudiante;
    protected Aula aulaEstudiante;
    private int opc = 0;
    matricula

    public Aula getAulaEstudiante() {
        return aulaEstudiante;
    }

    public void setAulaEstudiante(Aula aulaEstudiante) {
        this.aulaEstudiante = aulaEstudiante;
    }

    @Override
    public void Matricular() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al registro de matricula,\n" + "1. Estudiante primer ingreso\n" + "2. Estudiante regular"));
        switch(opc){
            default: JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta");
            Matricular();
            break;
            case 1: 
            
        }
    }
}
