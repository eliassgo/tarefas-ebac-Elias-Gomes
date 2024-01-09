package ifelse;

import java.util.Scanner;

public class ExemplosDeUso {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = s.nextInt();
        System.out.println("Você tem " + age + " anos.");
    }
}
