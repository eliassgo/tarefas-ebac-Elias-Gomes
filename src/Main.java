
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mediaNotas();
    }
    private static void mediaNotas() {
        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 9;
        int nota4 = 4;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println(media);
    }
}