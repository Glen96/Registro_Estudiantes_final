package Test;

import static org.junit.Assert.assertEquals;
import javax.swing.JOptionPane;
import org.junit.Test;

import Entidades.Estudiante;
import Entidades.menuPrincipal;
public class TestProfesor {
    protected int notaFinal;
    protected String reporte;
    private String profProgra = "Mateo Antonio";
    private String profMate= "Laura Carvajal";
    public Estudiante estudiante = new Estudiante();
    int opc;

    //Metodo para llamar el menu de profesor
    @Test
    public void LlamarMenuProfesor() {
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a la parte de consultas\n"
            +"Elija la opción que desea:\n"
            + "1. Consultar quien es el profesor de Programación\n"
            + "2. Consultar quien es el profesor de Matemáticas\n"
            + "3. Ingresar como profesor\n"
            + "4. Volver"));
            switch(opc){

                //Consultar quien es el prof de progra
                case 1:
                JOptionPane.showMessageDialog(null, "El profesor de programación es: "+ profProgra);
                break;

                //Consultar quien es el prof de mate
                case 2:
                JOptionPane.showMessageDialog(null, "El profesor de matemáticas es: "+ profMate);
                break;
                //
                //Para entrar como prof y elegir opciones
                case 3:
                JOptionPane.showMessageDialog(null, "Está ingresando como profesor\n");
                do{
                    opc= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué opción desea realizar?\n"
                    + "1. Hacer reporte del estudiante e ingresar su nota\n"
                    + "2. Volver"));
                    switch(opc){
                        case 1:
                        hacerReporte();
                        break;
                    }
                }while(opc!=2);
                break;
                case 4:
                menuPrincipal menuPrincipal = new menuPrincipal();
                menuPrincipal.llamarMenuPrincipal();
                break;
            }
        }while (opc!=7);
    }

    public void hacerReporte() {
        reporte = JOptionPane.showInputDialog(null,
                "Bienvenido, Ingresó a la parte de hacer reporte\n" + "Ingrese el reporte que desea hacer para el estudiante y asignelé su nota:\n"
                + "Ejem: Nombre del estudiante: (lo que desea mencionar del estudiante), *Nota fiinal*");
    }


    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
}
