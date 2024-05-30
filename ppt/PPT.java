package ppt;

import java.util.Scanner;
import java.util.Random;

public class PPT {

    public static void main(String[] args) {
System.out.println("PIEDRA, PAPEL O TIJERAS");
        try {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext()) {
                String userInput = quickFormat(sc.next());
                sc.close();
                if (isValid(userInput)) {
                    game(userInput);
                } else {
                    displayInputs();
                }
            } else {
                displayInputs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void game(String user) {
        String computer = computerResults();
        print(user + " vs " + computer + "\n");
        if (user.equalsIgnoreCase(computer)) {
            print("EMPATE.");
        } else {
            if (checkWin(user, computer)) {
                print("Ganaste contra la consola!");
            } else {
                print("Perdiste contra la consola!");
            }
        }
    }
    public static String computerResults() {
        String types[]
                = {"piedra", "papel", "tijeras"};
        Random rand = new Random();
        int computerChoice = rand.nextInt(3);
        return types[computerChoice];
    }
    public static boolean isValid(String input) {
        switch (input.toLowerCase()) {
            case "piedra":
                return true;
            case "papel":
                return true;
            case "tijeras":
                return true;
            default:
                return false;
        }
    }
    public static boolean checkWin(String user, String opponent) {
        if ((!isValid(user)) || (!isValid(opponent))) {
            return false;
        }
        String piedra = "piedra", papel = "papel", tijeras = "tijeras";
        if ((user.equalsIgnoreCase(piedra))
                && (opponent.equalsIgnoreCase(tijeras))) {
            return true;
        }
        if ((user.equalsIgnoreCase(tijeras))
                && (opponent.equalsIgnoreCase(papel))) {
            return true;
        }
        if ((user.equalsIgnoreCase(papel))
                && (opponent.equalsIgnoreCase(piedra))) {
            return true;
        }
        return false;
    }

    public static void displayInputs() {
        print("Invalido");
    }

    public static void print(String text) {
        System.out.println(text);
    }
    public static String quickFormat(String input) {
        String output = input;
        switch (input.toLowerCase()) {
            case "r":
                output = "piedra";
                break;
            case "s":
                output = "tijeras";
                break;
            case "p":
                output = "papel";
                break;
            case "tijera":
                output = "tijeras";
                break;
        }
        return output;
    }
}
