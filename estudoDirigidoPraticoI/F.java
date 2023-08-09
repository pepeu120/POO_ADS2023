import java.util.Random;


public class F {

    public static void main(String[] args) {
        int[] vetor = new Random()
            .ints(50, 0, 1001)
            .toArray();

        int maior = vetor[0];
        for (int i = 0; i < 50; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.print("[");
        for (int numero : vetor) {
            System.out.print(numero + ", ");
        }
        System.out.println("\b\b]");

        System.out.println("O maior numero do vetor é: " + maior);
    }
}