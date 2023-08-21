package estudoDirigidoPraticoI;

import java.util.Scanner;

public class B {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a nota da primeira prova: ");
        int notaProva1 = teclado.nextInt();

        System.out.printf("Digite a nota da segunda prova: ");
        int notaProva2 = teclado.nextInt();

        System.out.printf("Digite a nota do trabalho: ");
        int notaTrabalho = teclado.nextInt();
        teclado.close();

        float mediaFinal = (notaProva1 * 3 + notaProva2 * 3 + notaTrabalho * 1) / 7;
        
        System.out.printf("Media Final: %.2f ", mediaFinal);
        if (mediaFinal >= 7) {
            System.out.printf("APROVADO");
        } else {
            System.out.printf("Reprovado".toUpperCase());
        }
    }
}
