package atividadesFixacao.anexoII;

/*
10) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e
apresentar o resultado caso seja maior que 10.
*/

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat();

        float soma = valor1 + valor2;

        if (soma > 10) {
            System.out.printf("A soma é: %.2f", soma);
        }

        scanner.close();
    }
}
