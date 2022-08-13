package C02;
/*
Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
función debe comprobar si el primer número es divisible por el segundo.
boolean esDivisible(int n, int divisor)
NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
decimales.

*/
public class eje004 {
    public static void main(String[] args) {
        System.out.println(esDivisible(4,2));
    }

    private static boolean esDivisible(int n, int divisor) {
        return n%divisor==0;
    }
}
