
package herencia_figurageometrica;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<FiguraGeometrica> fg_al = Data.obtenerFigurasGeometricas();
                for (FiguraGeometrica fg: fg_al) {
                    System.out.println(fg);
                    System.out.println(" Area: " + fg.area());
                    System.out.println(" Perimetro: " + fg.perimetro());
                }
    }
   
    }

