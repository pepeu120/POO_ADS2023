package atividadesFixacao.anexoII;

/*
6) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média
final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a
mensagem reprovado”.
*/

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        float notaProva1 = scanner.nextFloat();

        System.out.print("Digite a nota da segunda prova: ");
        float notaProva2 = scanner.nextFloat();

        System.out.print("Digite a nota do trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        float media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        System.out.printf("Média: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
