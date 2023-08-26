package atividadesFixacao.anexoII;

/*
4) Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente
está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a
mensagem apropriada
*/

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura corporal: ");
        float temperatura = scanner.nextFloat();

        if (temperatura > 37) {
            System.out.println("Você está com febre.");
        } else {
            System.out.println("Sua temperatura está normal.");
        }

        scanner.close();
    }
}
