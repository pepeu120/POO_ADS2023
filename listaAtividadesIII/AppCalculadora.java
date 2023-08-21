package listaAtividadesIII;

import java.util.Scanner;

public class AppCalculadora {
    private static Scanner teclado = new Scanner(System.in);
    
    public static Scanner getTeclado() {
    return teclado;
    }

    public static double getDouble() {
        double valor = getTeclado().nextDouble();

        return valor;
    }

    public static int getInt() {
        int valor = getTeclado().nextInt();

        return valor;
    }

    private static void menu() {
        System.out.print("Digite um valor: ");
        double valor1 = getDouble();

        System.out.print("Digite um valor: ");
        double valor2 = getDouble();

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

            opcao = getInt();

            switch (opcao) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f", valor1, valor2, Calculadora.soma(valor1, valor2) );
                    break;

                case 2:
                    System.out.printf("%.2f - %.2f = %.2f", valor1, valor2, Calculadora.subtrai(valor1, valor2) );
                    break;

                case 3:
                    System.out.printf("%.2f * %.2f = %.2f", valor1, valor2, Calculadora.multiplica(valor1, valor2));
                    break;

                case 4:
                    System.out.printf("%.2f / %.2f = %.2f", valor1, valor2, Calculadora.divide(valor1, valor2));
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
    }
    
    public static void main(String[] args) {
        
        AppCalculadora.menu();
    }
}
