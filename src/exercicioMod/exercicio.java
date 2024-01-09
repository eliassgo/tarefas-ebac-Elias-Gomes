package exercicioMod;

import java.util.Scanner;
public class exercicio {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double nota1 = s.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double nota2 = s.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        double nota3 = s.nextDouble();

        System.out.println("Digite a 4ª nota: ");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        String resultado = getNota(media);
        System.out.println(resultado);
    }

    public static String getNota(double media) {
        if(media >= 7.0){
            return "Parabéns, sua média é " + media + " e você está APROVADO";
        } else if(media >= 5.0){
            return "Sua média é " + media + " e você está de RECUPERAÇÃO";
        } else {
            return "Sua média é " + media + " e você está REPROVADO";
        }
    }
}
