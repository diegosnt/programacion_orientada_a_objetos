package C03;

/*
Desafío 3
Implementar un programa que nos permite mostrar por consola los primeros “n” números
primeros, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
17”.
 */

import java.util.Scanner;

public class eje004_numeroPrimos {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int number1 = 0;
        int contador = 1;

        System.out.println("Ingresar cantidad de numeros primos:");
        number1 = scanner.nextInt();

        for (int i = 1; number1 > 0; i++) {
            if (esPrimo(i)) {
                System.out.println(contador + ": " + i);
                number1--;
                contador++;
            }
        }
    }

    private static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
