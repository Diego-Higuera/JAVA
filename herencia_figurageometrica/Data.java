
package herencia_figurageometrica;

import java.util.ArrayList;
import java.util.List;

public class Data {
    
    public static List<FiguraGeometrica> obtenerFigurasGeometricas() {
        List<FiguraGeometrica> fg_al = new ArrayList<>();
        fg_al.add(new Triangulo(2,5));
        fg_al.add(new Triangulo(1,4));
        fg_al.add(new Rectangulo(8,5));
        fg_al.add(new Rectangulo(7,4));
        fg_al.add(new Circulo(9));
        fg_al.add(new Circulo(3));
        fg_al.add(new Cuadrado(4));
        fg_al.add(new Cuadrado(2));
        return fg_al;
        
    }
}
