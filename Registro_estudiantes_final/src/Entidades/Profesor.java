package Entidades;

import javax.swing.JOptionPane;

public class Profesor extends Entidad {
    
    protected int notaFinal;
    protected String reporte;


    //metodo de iniciar sesion como profesor
    public void iniciarProf(){
        String nombreProf = JOptionPane.showInputDialog(null,
        "Bienvenido, Ingresó a la parte de Iniciar Sesión como Profesor\n"
        +"Ingrese su nombre:");
        setNombre(nombreProf);
    }
    public void ingresarNotaFinal(){
        notaFinal= Integer.parseInt(
            JOptionPane.showInputDialog(null,
            "Bienvenido, Ingresó a la parte de calificar\n"
            +"Ingrese la nota final del estudiante"));
    }
    public void hacerReporte(){
        reporte= 
            JOptionPane.showInputDialog(null,
            "Bienvenido, Ingresó a la parte de hacer reporte\n"
            +"Ingrese el reporte que desea hacer:");
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

    

public class Profesor {
    int prof;

}
