package C03;

import java.util.Scanner;

public class eje003_piedraPapelTijeraSpock {
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
            System.out.println("4 - Spock");
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

        if (    (jugador1.equals("1") && jugador2.equals("3")) ||
                (jugador1.equals("2") && jugador2.equals("1")) ||
                (jugador1.equals("3") && jugador2.equals("2")) ||
                (jugador1.equals("4") && ((jugador2.equals("1") || (jugador2.equals("3")))))
        )
        {
            return 1;
        }
        return 2;
    }
}