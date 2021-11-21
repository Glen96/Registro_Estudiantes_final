package Entidades;

import javax.swing.JOptionPane;

public class Aula {
    public String profesor;
    public String IDhorario;

    public void regristrarAula(){

            int op = 1;
            
            do{
                String arr = "1.Profesor de programacion\n2.Profesor de matematicas\n3.Volver\n";
                op = Integer.parseInt(JOptionPane.showInputDialog(null, arr));
                System.out.println(op);
                switch(op)
                {
                    case 1:
                    String ID[] = {
                        "Seleccione su horario",
                        "L 6:00 - 8:30",
                        "S 9:00 - 11:30",
                        "Volver",
                        };
                    
                        String opt = (String) JOptionPane.showInputDialog(null, "¡Bienvenidos!",
                                "Aula", JOptionPane.DEFAULT_OPTION, null, ID, ID[0]);

                                if ("L 6:00 - 8:30".equals(opt))
                                profesor=("Profesor de programacion");
                                IDhorario=("L 6:00 - 8:30");

                                if ("S 9:00 - 11:30".equals(opt))
                                profesor=("Profesor de programacion");
                                IDhorario = ("S 9:00 - 11:30");
                            break;
                    case 2:
                    String ID2[] = {
                        "Seleccione su horario",
                        "L 6:00 - 8:30",
                        "S 9:00 - 11:30",
                        "Volver",
                        };
                    
                    
                        String opt2 = (String) JOptionPane.showInputDialog(null, "¡Bienvenidos!",
                                "Aula", JOptionPane.DEFAULT_OPTION, null, ID2, ID2[0]);

                                if ("L 6:00 - 8:30".equals(opt2))
                                profesor=("Profesor de Matematicas");
                                IDhorario=("L 6:00 - 8:30");

                                if ("S 9:00 - 11:30".equals(opt2))
                                profesor=("Profesor de matematicas");
                                IDhorario=("S 9:00 - 11:30");

                        break;
                    default:
                    op = 3;
                        break;
            } 
        } while ( op != 3);
            
    }
}
