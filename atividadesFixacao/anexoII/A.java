package atividadesFixacao.anexoII;

/*
1) Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
usuário a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e
informar o seu salário sabendo que ele ganha R$ 20,00 por hora
*/

import java.util.Scanner;

public class A {

    public static float calcularSalario(int horasTrabalhadas) {
        float salarioPorHora = 20f;
        return horasTrabalhadas * salarioPorHora;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        float salarioTotal = calcularSalario(horasTrabalhadas);

        System.out.println("Salário total: R$" + salarioTotal);

        scanner.close();
    }
}
