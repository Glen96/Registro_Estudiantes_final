package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.junit.Test;
import Entidades.*;

public class matriculaXEstudianteTest {
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    // Se prueba el metodo nuevoEstudiante de la clase matriculaXestudiante
    @Test
    public void nuevoestudiante() {
        Estudiante nuevo = new Estudiante();
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
            assertEquals("Dexter CR 25 11 Profesor de programacion L 6:00 - 8:30",
                    "" + listaEstudiantes.get(i).getNombre() + " " + listaEstudiantes.get(i).getNacionalidad() + " "
                            + listaEstudiantes.get(i).getEdad() + " " + listaEstudiantes.get(i).getCedula() + " "
                            + listaEstudiantes.get(i).getAulaEstudiante().AulaAsignada);
        }
    }
}
