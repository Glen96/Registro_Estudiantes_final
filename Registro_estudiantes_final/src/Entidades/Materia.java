package Entidades;

public class Materia {
    protected String nombreCurso = "Matematicas";
    protected String descrip = "Materia que se lleva en el segundo cuatrimestre de la carrera.";
    protected int creditos = 4;

    public Materia (String nombreCurso, String descrip, int creditos){
        this.nombreCurso = nombreCurso;
        this.descrip = descrip;
        this.creditos = creditos;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
    public String getDescrip (){
        return descrip;
    }
    public int getCreditos (){
        return creditos;
    }
    
}
