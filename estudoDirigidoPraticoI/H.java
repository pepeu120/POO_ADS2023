package estudoDirigidoPraticoI;

import java.util.Random;

public class H {

    public static void main(String[] args) {
        int[] vetorInicial = new Random()
            .ints(10, 0, 51)
            .toArray();
        
        int countMenoresQ10 = 0;
        for (int numero : vetorInicial) {
            if (numero < 10) {
                countMenoresQ10++;
            }
        }
        int[] vetorMenoresQ10 = new int[countMenoresQ10];

        for (int i = 0, v = 0; i < vetorInicial.length; i++) {
            if (vetorInicial[i] < 10) {
                vetorMenoresQ10[v] = vetorInicial[i];
                v++;
            }
        }
        System.out.print("Vetor Inicial: ");
        System.out.print("[");
        for (int numero : vetorInicial) {
            System.out.print(numero + ", ");
        }
        System.out.println("\b\b]");

        System.out.print("Vetor Fatorial: ");
        if (vetorMenoresQ10.length > 0){
            System.out.print("[");
            for (long numero : vetorMenoresQ10) {
                System.out.print(numero + ", ");
            }
            System.out.println("\b\b]");
        } else {
            System.out.println("[]");
        }
    }
    
}
