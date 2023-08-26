package atividadesFixacao.anexoII;

/*
7) Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o
usuário está obeso
*/

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Digite a altura (em metros): ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc > 30) {
            System.out.println("Você está obeso");
        } else {
            System.out.println("Você não está obeso");
        }

        scanner.close();
    }
}
