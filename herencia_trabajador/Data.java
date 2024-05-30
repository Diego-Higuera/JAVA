package herencia_trabajador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Trabajador> obtenerTrabajadores() {
        List<Trabajador> trabajadores_al = new ArrayList<>();
        trabajadores_al.add(new trabajadorTipo1(450.56, "t1", "Luis", "Rabanal"));
        trabajadores_al.add(new trabajadorTipo2(350, 2877, "t2", "Miguel", "Roncal"));
        trabajadores_al.add(new trabajadorTipo3(2389, "t3", "Carmen", "Jauregui"));
        trabajadores_al.add(new trabajadorTipo4(150, 15, "t4", "Maria", "Zavaleta"));
        return trabajadores_al;
    }

    public static List<Trabajador> obtenerTrabajadoresArchivoCsv() {
        List<Trabajador> trabajadores_al = new ArrayList<>();
        File f;
        FileReader fr;
        BufferedReader br;
        String fila = "";
        String[] parte;
        try {
            f = new File("data/trabajador.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((fila = br.readLine()) != null) {
                parte = fila.split(";");
                if (parte[3].equalsIgnoreCase("1")) {

                    trabajadorTipo1 t1 = new trabajadorTipo1(Double.parseDouble(parte[4]),parte[0],parte[1],parte[2]);
                        trabajadores_al.add(t1);
                }
                if (parte[3].equalsIgnoreCase("2")) {
                    String[] p = parte[4].split("#");
                    trabajadorTipo2 t2 = new trabajadorTipo2(Double.parseDouble(p[0]),Double.parseDouble(p[1]),parte[0],parte[1],parte[2]);
                    trabajadores_al.add(t2);   
                }
                if (parte[3].equalsIgnoreCase("3")) {
                    trabajadorTipo3 t3 = new trabajadorTipo3(Integer.parseInt(parte[4]),parte[0],parte[1],parte[2]);
                    trabajadores_al.add(t3);
                }
                if (parte[3].equalsIgnoreCase("4")) {
                    String[] p = parte[4].split("#");
                    trabajadorTipo4 t4 = new trabajadorTipo4(Integer.parseInt(p[0]),Integer.parseInt(p[1]),parte[0],parte[1],parte[2]);
                     trabajadores_al.add(t4);
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR DE LECTURA");
            trabajadores_al = null;
        }
        return trabajadores_al;
    }
}
