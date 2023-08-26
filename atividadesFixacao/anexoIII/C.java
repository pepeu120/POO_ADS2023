package atividadesFixacao.anexoIII;

/*
3) Faça um algoritmo que solicite ao usuário para digitar 50 números entre 1 e 100. Informe o
menor número digitado.
*/

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorNumero = Integer.MAX_VALUE; // Inicializa o menor número com o maior valor possível

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor número digitado é: " + menorNumero);

        scanner.close();
    }
}
