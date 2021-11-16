package Entidades;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class matriculaXestudiante extends Entidad{

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    public void nuevoestudiante (){
        Estudiante nuevo = new Estudiante();
        String pNombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        setNombre(pNombre);
        String pNacionalidad = JOptionPane.showInputDialog(null, "Ingrese su nacionalidad: ");
        setNacionalidad(pNacionalidad);
        short pEdad = Short.parseShort(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
        setEdad(pEdad);
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula: "));
        setCedula(pCedula);
        Aula aulaE = new Aula();
        regristrarAula();

        nuevo.setAulaEstudiante(aulaE);

        listaEstudiantes.add(nuevo);
    }

    public boolean buscarestudiante (){
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar: "));

        for(int x = 0; x < listaEstudiantes.size(); x++){
            if (listaEstudiantes.get(x).getCedula() == pCedula){
                System.out.println("Estudiante registrado!");
                return true;
            }
        }
        System.out.println("Estudiante NO registrado!");
        return false;
    }

    
    public String mostrarEstudiante (){
        int pCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar: "));

        for(int x = 0; x < listaEstudiantes.size(); x++){
            if (listaEstudiantes.get(x).getCedula() == pCedula){

                return "Información del estudiante\n" + 
                "Nombre: " + listaEstudiantes.get(x).getNombre() + "\n" + 
                "Nacionalidad: " + listaEstudiantes.get(x).getNacionalidad() + "\n" + 
                "Cedula: " + listaEstudiantes.get(x).getCedula() + "\n" + 
                "Horario\n" + listaEstudiantes.get(x).getAulaEstudiante().profesor + "\n" + 
                listaEstudiantes.get(x).getAulaEstudiante().IDhorario;
            }
        }
        return "Estudiante NO registrado!";
    }
}