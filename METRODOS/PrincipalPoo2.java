
package METRODOS;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        int radio;
        Circulo.cabecera(); //metodo de clase igual que Math.PI
        for (int i=0; i<100; i++) {
            Circulo c = new Circulo();
            radio = (int)(Math.random()*6+1);
            c.setRadio(radio);
            c.cuerpo();
           
        }
        
    }
    
}
