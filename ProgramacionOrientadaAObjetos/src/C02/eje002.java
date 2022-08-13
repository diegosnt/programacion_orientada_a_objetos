package C02;

/*
Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
Informar el resultado obtenido.
*/

public class eje002 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;

        if (number1 > number2) {
            System.out.println(number1 + " es mayor que " + number2);
        }else if (number2 > number1) {
            System.out.println(number2 + " es mayor que " + number1);
        } else {
            System.out.println(number2 + " es igual a " + number1);
        }

    }
}
