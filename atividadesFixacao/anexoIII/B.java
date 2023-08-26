package atividadesFixacao.anexoIII;

/*
2) Faça um algoritmo que solicite ao usuário para digitar 50 números entre 1 e 100. Informe o
maior número digitado.
*/

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE; // Inicializa o maior número com o menor valor possível

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maiorNumero);

        scanner.close();
    }
}
