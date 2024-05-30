package metodos;

public class Principal2 {

    public static void main(String[] args) {
        //CREAR Y LLENADO VECTOR ALEATORIO
        int[] vector = new int[10];
        //LLENAR
        llenar(vector);
        //MOSTRAR
        mostrar(vector);
    }
    
    //IMPLEMENTAR UN METODO PARA LLENAR EL VECTOR
    public static void llenar(int[] v) {
        for(int i=0; i<v.length; i++) {
            v[i] = (int)(Math.random()*6+1);
        }
    }
    
    //IMPLEMENTAR UN METODO QUE MUESTRE EL VECTOR
    public static void mostrar(int[] v) {
        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + "   ");
        }
    }
}
