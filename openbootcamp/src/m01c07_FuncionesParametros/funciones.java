package m01c07_FuncionesParametros;

public class funciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Diego");

        System.out.println(devolverHolamundo());
    }

    public static void holaMundo() {
        System.out.println("hola mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("hola mundo " + name);
    }

    private static String devolverHolamundo(){
        return "Hola mundo!!!";
    }

}
