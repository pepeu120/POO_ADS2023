package atividadesFixacao.anexoIII;

/*
4) Faça um algoritmo que solicite ao usuário para digitar um valor numérico entre 0 e 5. Caso
o número digitado esteja entre 1 e 5 imprima em extenso o valor (Ex: “Um”, “Dois”, “Três”,
Quarto”, “Cinco”) e repita a operação. Caso o usuário digite 0 o programa exibe a mensagem
“Saindo do Algoritmo...” e chega ao fim.
*/

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um valor numérico entre 0 e 5 (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 5) {
                String extenso = converterParaExtenso(numero);
                System.out.println("Valor por extenso: " + extenso);
            } else if (numero != 0) {
                System.out.println("Número fora do intervalo.");
            }

        } while (numero != 0);

        scanner.close();
    }

    public static String converterParaExtenso(int numero) {
        String[] numerosExtenso = {"Um", "Dois", "Três", "Quatro", "Cinco"};
        return numerosExtenso[numero - 1];
    }
}
