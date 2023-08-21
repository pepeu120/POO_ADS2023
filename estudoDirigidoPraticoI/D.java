package estudoDirigidoPraticoI;

import java.util.Scanner;

public class D {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = teclado.nextInt();

        System.out.print("Digite o segundo numero: ");
        float valor2 = teclado.nextInt();

        int opcao;
        do {
            System.out.print("""
                \n
                Escolha uma opção:
                [1] Somar
                [2] Subtrair
                [3] Multiplicar
                [4] Divisão
                [5] Novos numeros
                [0] Sair
                opção: """);
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f", valor1, valor2, valor1 + valor2 );
                    break;

                case 2:
                    System.out.printf("%.2f - %.2f = %.2f", valor1, valor2, valor1 - valor2 );
                    break;

                case 3:
                    System.out.printf("%.2f * %.2f = %.2f", valor1, valor2, valor1 * valor2 );
                    break;

                case 4:
                    System.out.printf("%.2f / %.2f = %.2f", valor1, valor2, valor1 / valor2 );
                    break;

                case 5:
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = teclado.nextInt();

                    System.out.print("Digite o segundo numero: ");
                    valor2 = teclado.nextInt();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Digite uma opção valida");
            }
        } while (opcao != 0);
        teclado.close();
    }
}
