package ejemplos_clase;

import java.util.Scanner;

public class conversionhexadecimal {

    public static void main(String[] args) {

        int valorletra, decimal = 0;
        char letra = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese hexadecimal: ");
        String hexa = sc.next();

        for (int i = 0, j = hexa.length() - 1; i < hexa.length(); i++, j--) {
            System.out.println(hexa.charAt(i));
            letra = hexa.charAt(i);
            switch (letra) {
                case 'A':
                    valorletra = 10;
                    break;
                case 'B':
                    valorletra = 11;
                    break;
                case 'C':
                    valorletra = 12;
                    break;
                case 'D':
                    valorletra = 13;
                    break;
                case 'E':
                    valorletra = 14;
                    break;
                case 'F':
                    valorletra = 15;
                    break;
                default:
                    valorletra = Integer.parseInt(letra + "");
            }
            decimal = decimal + valorletra * (int) Math.pow(16, j);
        }
        System.out.println("Decimal: " + decimal);
    }

}
