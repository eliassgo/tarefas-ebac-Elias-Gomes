package ifelse;

import java.util.Scanner;

public class AnimalExample {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Type a animal name: ");
        String text = s.next();
        String animal = exampleOfIf(text);
        System.out.println(animal);
    }

    public static String exampleOfIf(String animal){
        String result;

        if(animal.equals("DOG") || animal.equals("CAT")){
            result = "domestic animal";
        } else if(animal.equals("TIGER")){
            result = "Wild animal";
        } else {
            result = "Unknown animal";
        }

        return result;
    }
}
