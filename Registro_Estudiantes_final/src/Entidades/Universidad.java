package Entidades;
import javax.naming.directory.SearchResult;
import javax.swing.JOptionPane;
import java.util.ArrayList;
//Metodo para nueva matricula
public class Universidad{
    public matriculaXestudiante matricula = new matriculaXestudiante();
    
    
    public matriculaXestudiante getMatricula() {
        return matricula;
    }

    public String sede;

//asignar sede
    public void menusede(){

        sede=JOptionPane.showInputDialog("Indique la sede");
        
    }
    
    //validar cedula
    public boolean cedulabuscada;
    public void validarmatricula(){
    }
}