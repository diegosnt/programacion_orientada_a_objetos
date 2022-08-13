package C03;

/*
Desafío 4
Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
horas las mismas se consideran horas extras cuyo valor es un 50 % más que las horas de
trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
hora semanal es de 875.
*/

import java.util.Scanner;
import java.time.*;

public class eje005_horasLaborales {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int horasTrabajadas = 0;
        double sueldoSemanal;
        System.out.println("Ingresar horas trabajadas:");
        horasTrabajadas = scanner.nextInt();


        if (horasTrabajadas > 40) {
            sueldoSemanal = (40 * 875) + ((horasTrabajadas - 40) * (875 * 1.5));
        }else {
            sueldoSemanal = 40 * 875;
        }
        System.out.println("Sueldo Semanal: " + sueldoSemanal);


        int year1 = 0;
        Year thisYear = Year.now();

        // Print the year object
        //year1 =  Integer.parseInt(thisYear);

                System.out.println(thisYear.getClass().getName());



    }
}

