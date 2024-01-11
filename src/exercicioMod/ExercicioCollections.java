package exercicioMod;
import java.util.*;

public class ExercicioCollections {
    public static void main(String args[]){
        exibirNomes();
       exibirGrupos();
    }
    private static void exibirNomes(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nome separados por vígula. (ex: Elias,Junior): ");

        String nomes = s.nextLine();
        String[] nomesArray = nomes.split(",");

        Arrays.sort(nomesArray, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Nomes:");
        for (String nome: nomesArray){
            System.out.println(nome.trim());
        }
    }

    private static void exibirGrupos(){
        Scanner s = new Scanner(System.in);

        Map<String, String> listaSexoMasculino = new HashMap<>();
        Map<String, String> listaSexoFeminino = new HashMap<>();
        String condition = "";

        System.out.println("-------------- CADASTRO DE PESSOAS --------------");
        do{
            System.out.println("Digite o seu nome: ");
            String nome = s.nextLine();

            System.out.println("Digite o seu sexo (F ou M): ");
            String sexo = s.nextLine();

            if(sexo.equals("F")){
                listaSexoFeminino.put(nome, sexo);
            } else {
                listaSexoMasculino.put(nome, sexo);
            }

            System.out.println("Você deseja adicionar novamente (S ou N)? ");
            condition = s.nextLine();

        } while (condition.equals("S"));

        System.out.println("------ GRUPO SEXO FEMININO  -------");
        Set<Map.Entry<String, String>> entry1 = listaSexoFeminino.entrySet();
        for (Map.Entry<String, String> e : entry1){
            System.out.println("Nome: " + e.getKey() + " Sexo: " + e.getValue());
        }

        System.out.println("------ GRUPO SEXO MASCULINO  -------");
        Set<Map.Entry<String, String>> entry2 = listaSexoMasculino.entrySet();
        for (Map.Entry<String, String> e : entry2){
            System.out.println("Nome: " + e.getKey() + " Sexo: " + e.getValue());
        }

    }
}
