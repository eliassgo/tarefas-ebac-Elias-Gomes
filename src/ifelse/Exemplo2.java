package ifelse;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma letra: ");

        String str = s.next();

        if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.println("A letra " + str + " é uma vogal");
        } else {
            System.out.println("A letra " + str + " não é uma vogal");
        }
    }
}
