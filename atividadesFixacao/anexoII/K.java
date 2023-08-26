package atividadesFixacao.anexoII;

/*
11) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o
resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado
deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o
usuário.
*/

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat();

        float soma = valor1 + valor2;

        if (soma >= 10) {
            soma += 5;
        } else {
            soma -= 7;
        }

        System.out.printf("Resultado: %.2f", soma);

        scanner.close();
    }
}
