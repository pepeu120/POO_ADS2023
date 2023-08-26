package atividadesFixacao.anexoII;

/*
2) Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.
*/

import java.util.Scanner;

public class B {

    public static float calcularQuantidadeGasolina(float distancia) {
        float consumoMedio = 12f; // KM/L
        return distancia / consumoMedio;
    }

    public static float calcularCustoViagem(float quantidadeGasolina, float precoGasolina) {
        return quantidadeGasolina * precoGasolina;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância a ser percorrida (em km): ");
        float distancia = scanner.nextFloat();

        System.out.print("Digite o preço do litro de gasolina: ");
        float precoGasolina = scanner.nextFloat();

        float quantidadeGasolina = calcularQuantidadeGasolina(distancia);
        float custoViagem = calcularCustoViagem(quantidadeGasolina, precoGasolina);

        System.out.printf("Quantidade de gasolina necessária: %.2f L\n", quantidadeGasolina);
        System.out.printf("Custo da viagem: R$%.2f", custoViagem);

        scanner.close();
    }
}
