package estudoDirigidoPraticoI;

import java.util.Scanner;


public class J {
    
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os numeros, um por vez, da matriz 5x4:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("[%d]X[%d]: ", l, c);
                matriz[l][c] = teclado.nextInt();
                System.out.println();
            }
        }
        System.out.print("Digite um numero para verificar se ele esta na matriz: ");
        int numero = teclado.nextInt();
        teclado.close();

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 4; c++) {
                if (numero == matriz[l][c]) {
                    System.out.printf("O numero %d esta na posição [%d]X[%d] da matriz", numero, l, c);
                    break;
                } else {
                    System.out.printf("O numero %d não esta na matriz", numero);
                }
            }
        }        
    }    
}
