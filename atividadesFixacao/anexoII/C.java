package atividadesFixacao.anexoII;

/*
3)Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá
tirar a carteira de motorista se a idade for maior que 18 anos.
*/

import java.util.Scanner;

public class C {

    public static boolean podeTirarCarteira(int idade) {
        return idade > 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (podeTirarCarteira(idade)) {
            System.out.println("Você pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você não pode tirar a carteira de motorista ainda.");
        }

        scanner.close();
    }
}
