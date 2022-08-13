package C03;

import java.util.Scanner;

public class eje001_Veterinaria {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String nombre;
        double pesoNecesario;
        int cantiadPaquetes;

        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Cantidad: ");
        pesoNecesario = scanner.nextDouble();

        cantiadPaquetes = cuantosPaquetes(pesoNecesario);
        System.out.println("La caidad de paquetes que necesita " + nombre + " es " + cantiadPaquetes);

    }

    private static int cuantosPaquetes(double pesoNecesario) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        double pesoAcumulado = 0;
        int cantidad = 0;
        double peso = 0;

        while (pesoAcumulado < pesoNecesario){
            System.out.println("Peso del paquete");
            peso = scanner.nextDouble();

            pesoAcumulado += peso;
            cantidad++;
        }
        return cantidad;
    }
}
