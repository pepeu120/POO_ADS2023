import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();
        teclado.close();

        int soma = valor1 + valor2;

        System.out.printf("A soma de %d + %d é: %d", valor1, valor2, soma);
    }
}
