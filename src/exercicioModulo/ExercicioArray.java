package exercicioModulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArray {

    public static void main(String args[]){
        listaAlunos();
    }

    private static void listaAlunos() {
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Elias");
        listaNomes.add("Gabriel");
        listaNomes.add("Alessandra");
        listaNomes.add("Thomas");
        listaNomes.add("Cecília");

        Collections.sort(listaNomes);

        System.out.println("Nomes ordenados em ordem alfabética: " + listaNomes);

    }
}
