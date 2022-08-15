package m01c08_Sentencias_if;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Ok!!!");

        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000 ;

        if (check) {
            System.out.println("Verdadero 1");
        }

        if (number1 < number2 && number2 < number3) {
            System.out.println("Verdadero");
        } else if (number3< number4) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }

        System.out.println("Fin");
    }
}
