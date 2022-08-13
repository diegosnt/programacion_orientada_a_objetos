package C02;

// Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
// una tercera tus iniciales.
import java.util.Scanner;

public class eje003_Scanner {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String nombre = "";
        String apellido = "";
        String iniciales = "";

        System.out.println("Ingrese nombre:" );
        nombre = scanner.next();

        System.out.println("Ingrese apellido:" );
        apellido = scanner.next();

        iniciales = nombre.substring(0,1) + apellido.substring(0,1);

        System.out.println(iniciales);
    }
}
