package treeset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class principal {

    public static void main(String[] args) {
        Set<String> nombres_ts = new TreeSet<>();

        File f;
        FileReader fr;
        BufferedReader br;

        String fila = "";

        try {
            f = new File("data/nombre.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((fila = br.readLine()) != null) {
                nombres_ts.add(fila);
            }
        } catch (Exception e) {
            System.out.println("ERROR LECTURA");
        }
        System.out.println("TAMAÑO: " + nombres_ts.size());
        
        int i = 1;
        for(String nombre: nombres_ts) {
            System.out.println( i + " " + nombre);
            i++;
        }
        FileWriter fw;
        BufferedWriter bw;
        
        try {
            f = new File("data/nombre1.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            
            for(String nombre: nombres_ts) {
            bw.write(nombre + "\n");
            }
            bw.flush();
        }catch(Exception e) {
            System.out.println("ERROR DE ESCRITURA");
        }
    }

}
