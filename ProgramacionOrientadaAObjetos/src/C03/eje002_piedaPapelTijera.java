package C03;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

/*
Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.
*/
public class eje002_piedaPapelTijera {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String gamer1 = "";
        String gamer2 = "";
        String jugada1 = "";
        String jugada2 = "";

        System.out.println("Ingresar nombre gamer 1: ");
        gamer1 = scanner.nextLine();
        System.out.println("Ingresar nombre gamer 2: ");
        gamer2 = scanner.nextLine();

        int resultado = 0;
        int puntos1 = 0;
        int puntos2 = 0;

        do {
            System.out.println("Opciones:");
            System.out.println("1 - Piedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tijera");
            System.out.println("* - Finalizar");

            System.out.println(gamer1 + " ingredar (1,2 o 3): ");
            jugada1 = scanner.next();

            if(jugada1.equals("*")){
                break;
            }

            System.out.println(gamer2 + " ingredar (1,2 o 3): ");
            jugada2 = scanner.next();

           resultado =  cualGana(jugada1, jugada2);

           if(resultado == 1){
               puntos1 ++;
           } else {
               puntos2 ++;
           }

        } while (!jugada1.equals("*"));

        System.out.println("Puntos " + gamer1 + ": " +puntos1);
        System.out.println("Puntos " + gamer2 + ": " +puntos2);

    }

    private static int cualGana(String jugador1, String jugador2) {

        if (jugador1 == jugador2) {
            return 0;
        }

        if ((jugador1.equals("1") && jugador2.equals("3")) ||
                (jugador1.equals("3") && jugador2.equals("2"))) {
            return 1;
        }
        return 2;
    }
}
