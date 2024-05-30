package metodos;

public class Principal1 {

    public static void main(String[] args) {
        
        //VECTOR
        int[] enteros = {3, 4, 2, 7, 8};//--> {9, 16, 4, 49, 64}
        cuadrado(enteros);
        for(int i=0; i<enteros.length; i++) {
            System.out.print(enteros[i] + "   ");
        }
       
        //System.out.println(redondear(3.1446));//VALOR
        
        
    }
    
    public static double redondear(double x) {
        double y = Math.round(x * 100.0) / 100.0;
        return y;
    }
    
    //CREAR UN METODO DONDE LE PASO UN VECTOR
    public static void cuadrado(int[] vector) {
        for(int i=0; i<vector.length; i++) {
            vector[i] = (int)Math.pow(vector[i],2);//9  -- 9.0
        }
    }
}
