package atividadesFixacao.anexoII;

/*
8) Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da
área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O
valor do Raio será informado pelo usuário.
*/

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        float raio = scanner.nextFloat();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área da circunferência: %.2f\n", area);

        scanner.close();
    }
}
