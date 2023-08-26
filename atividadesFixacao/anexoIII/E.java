package atividadesFixacao.anexoIII;

/*
5) Em uma eleição presidencial existem quatro candidatos. Os votos são informados através
de códigos.
    Os dados utilizados para a contagem dos votos obedecem a seguinte codificação:
    a) 1, 2, 3, 4 = voto para os respectivos candidatos;
    b) 5 = voto em branco, senão considerar voto nulo
    Elaborar um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
    a) total de votos para cada candidato;
    b) total de votos nulos;
    c) total de votos em branco.
    Como finalizador do conjunto de votos, tem-se o valor 0.
*/

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto;
        int totalCandidatoA = 0;
        int totalCandidatoB = 0;
        int totalCandidatoC = 0;
        int totalCandidatoD = 0;
        int totalNulos = 0;
        int totalBrancos = 0;

        do {
            System.out.print("Digite o código do candidato (ou 0 para sair): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    totalCandidatoA++;
                    break;
                case 2:
                    totalCandidatoB++;
                    break;
                case 3:
                    totalCandidatoC++;
                    break;
                case 4:
                    totalCandidatoD++;
                    break;
                case 5:
                    totalBrancos++;
                    break;
                default:
                    totalNulos++;
                    break;
            }

        } while (voto != 0);

        System.out.println("Total de votos para o Candidato A: " + totalCandidatoA);
        System.out.println("Total de votos para o Candidato B: " + totalCandidatoB);
        System.out.println("Total de votos para o Candidato C: " + totalCandidatoC);
        System.out.println("Total de votos para o Candidato D: " + totalCandidatoD);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);

        scanner.close();
    }
}
