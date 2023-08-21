package estudoDirigidoPraticoI;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digite um numero: ");
        int valor1 = teclado.nextInt();
        
        System.out.print("digite outro numero: ");
        int valor2 = teclado.nextInt();
        teclado.close();

        int maior;
        if (valor1 > valor2){
            maior = valor1;
        } else {
            maior = valor2;
        }
        
        System.out.printf("O maior numero digitado foi: %d", maior);
    }
}