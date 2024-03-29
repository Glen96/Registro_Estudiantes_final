package Entidades;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class matriculaXestudiante {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    public void nuevoestudiante() {
        Estudiante nuevo = new Estudiante();
        if (nuevo.getIdEstudiante() == 0) {
            nuevo.setIdEstudiante(1);
        } else {
            nuevo.setIdEstudiante(nuevo.getIdEstudiante() + 1);
        }
        String pNombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        nuevo.setNombre(pNombre);
        String pNacionalidad = JOptionPane.showInputDialog(null, "Ingrese su nacionalidad: ");
        nuevo.setNacionalidad(pNacionalidad);
        short pEdad = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
        nuevo.setEdad(pEdad);
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula: "));
        nuevo.setCedula(pCedula);
        Aula aulaE = new Aula();
        aulaE.regristrarAula();
        nuevo.setAulaEstudiante(aulaE);
        listaEstudiantes.add(nuevo);
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println("El estudiante: " + listaEstudiantes.get(i).getNombre() + " "
                    + listaEstudiantes.get(i).getNacionalidad() + " " + listaEstudiantes.get(i).getEdad() + " "
                    + listaEstudiantes.get(i).getCedula() + " "
                    + listaEstudiantes.get(i).getAulaEstudiante().AulaAsignada + " fue ingresado correctamente");

        }
    }

    public boolean buscarestudiante() {
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar: "));

        for (int x = 0; x < listaEstudiantes.size(); x++) {
            if (listaEstudiantes.get(x).getCedula() == pCedula) {
                System.out.println("Estudiante registrado!");
                return true;
            }
        }
        System.out.println("Estudiante NO registrado!");
        return false;
    }

    public String mostrarEstudiante() {
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar: "));

        for (int x = 0; x < listaEstudiantes.size(); x++) {
            if (listaEstudiantes.get(x).getCedula() == pCedula) {

                return "Información del estudiante\n" + "Nombre: " + listaEstudiantes.get(x).getNombre() + "\n"
                        + "Nacionalidad: " + listaEstudiantes.get(x).getNacionalidad() + "\n" + "Cedula: "
                        + listaEstudiantes.get(x).getCedula() + "\n" + "Horario\n"
                        + listaEstudiantes.get(x).getAulaEstudiante().profesor + "\n"
                        + listaEstudiantes.get(x).getAulaEstudiante().IDhorario;
            }
        }
        return "Estudiante NO registrado!";
    }
}