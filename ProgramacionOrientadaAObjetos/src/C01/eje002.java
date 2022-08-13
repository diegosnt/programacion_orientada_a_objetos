package C01;

public class eje002 {
    public static void main(String[] args) {
       int numeroEntero = 5;
       double numeroConComa = 1.5;
        System.out.println( suma(numeroEntero, numeroConComa));
    }

    private static double suma(double num1, double num2 ) {
        return num1 + num2;
    }
}
