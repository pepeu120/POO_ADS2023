package atividadesFixacao.anexoIII;

/*
1) Faça um algoritmo que solicite ao usuário para digitar um número. Informe quais os
divisores deste número.
*/

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores de " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
