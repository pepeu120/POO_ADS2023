package atividadesFixacao.anexoII;

/*
9) Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados,
tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do
INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor
do salário líquido.
*/

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora/aula: ");
        float valorHoraAula = scanner.nextFloat();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        float percentualINSS = scanner.nextFloat();

        float salarioBruto = valorHoraAula * horasTrabalhadas;
        float descontoINSS = (percentualINSS / 100) * salarioBruto;
        float salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Desconto do INSS: R$ " + String.format("%.2f", descontoINSS));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}
