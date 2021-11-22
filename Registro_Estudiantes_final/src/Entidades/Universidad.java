package Entidades;

//import javax.naming.directory.SearchResult;
import javax.swing.JOptionPane;

//import java.util.ArrayList; validar utlizacion 
//Metodo para nueva matricula
public class Universidad {
    public matriculaXestudiante matricula = new matriculaXestudiante();
    int opc;

    public void LlamarMenuUniversidad() {
        opc = Integer.parseInt(
                JOptionPane.showInputDialog(null, "!Modulo Universidad!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Buscar Estudiante\n" + "2. Mostrar Estudiante\n" + "3. Salir\n"));
        switch (opc) {
            default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta", "Opcion Invalida",
                    JOptionPane.ERROR_MESSAGE);
            LlamarMenuUniversidad();
            break;
            case 1:
            getMatricula().buscarestudiante();
            break;
            case 2:
            JOptionPane.showMessageDialog(null, getMatricula().mostrarEstudiante());
            break;
            case 3:
            menuPrincipal menuPrincipal = new menuPrincipal();
            menuPrincipal.llamarMenuPrincipal();
            break;
        }
    }

    public matriculaXestudiante getMatricula() {
        return matricula;
    }

    public String sede;

    // asignar sede
    public void menusede() {

        sede = JOptionPane.showInputDialog("Indique la sede");

    }

    // validar cedula
    public boolean cedulabuscada;

    public void validarmatricula() {
    }
}