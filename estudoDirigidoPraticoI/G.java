package estudoDirigidoPraticoI;

import java.util.Random;
//import java.util.Arrays;


public class G {

    public static void main(String[] args) {
        int[] vetorInicial = new Random()
            .ints(15, 3, 20)
            .toArray();
        
        long[] vetorFatorial = new long[15];

        for (int i = 0; i < 15; i++) {
            long fatorial = vetorInicial[i];

            for (int x = vetorInicial[i] - 1; x > 1; x--) {
                fatorial = fatorial * x;
                System.out.println(".");
            }
            vetorFatorial[i] = fatorial;
        }
        System.out.print("Vetor Inicial: ");
        System.out.print("[");
        for (int numero : vetorInicial) {
            System.out.print(numero + ", ");
        }
        System.out.println("\b\b]");

        System.out.print("Vetor Fatorial: ");
        System.out.print("[");
        for (long numero : vetorFatorial) {
            System.out.print(numero + ", ");
        }
        System.out.println("\b\b]");
    }
}
