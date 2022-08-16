package m01c11_ContinueBreak;

public class WhileBreak {
    public static void main(String[] args) {
        int count = 0;
        
        while (count < 10 ){
            count++;
            System.out.println(count + " - Hola mundo 1");
            if (count == 6){
                continue;
            }
            System.out.println(count + " - Hola mundo 2");

        }
        System.out.println("FIN!!!");
    }
}
