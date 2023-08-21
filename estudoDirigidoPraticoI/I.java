package estudoDirigidoPraticoI;

import java.util.Random;

public class I {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Random random = new Random();

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = random.nextInt(31);
            }
        }

        System.out.println("[");
        for (int l = 0; l < 3; l++) {
            System.out.print("[");
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[l][c] + ", ");
            }
            System.out.println("\b\b],");
        }
        System.out.println("\b\b]");

        int count = 0;
        System.out.printf("Numeros maiores que 10: [");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[l][c] > 10) {
                    count++;
                    System.out.print(matriz[l][c] + ", ");
                }
            }
        }
        System.out.println("\b\b]\nTotal: " + count);
    }
    
}
