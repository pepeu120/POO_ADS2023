package atividadesFixacao.anexoII;

/*
5) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.
*/

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.printf("O maior número é: %.2f", num1);
        } else if (num2 > num1) {
            System.out.printf("O maior número é: %.2f", num2);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
