package listaExercicioVI;

public class AppBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro( "Aventuras na Floresta", "João da Silva", "Aventura",
            "Editora ABC", 2023, 10, 1, "1234567890");

        Filme filme = new Filme( "Aventuras Espaciais", "Maria Souza", "Ficção Científica",
            "Estúdio XYZ", 2023, 5, "João Silva",
            "Atores Incríveis", "Uma emocionante jornada pelo espaço", 120);

        Publicacao[] publicacoes = {livro, filme};

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
            System.out.println("-".repeat(30));
        }
    }
}

/*
    V. Explique com suas palavras porque foi possível adiciona no array de publicação um objeto do tipo Filme e um
    objeto tipo Livro?
        Toda classe que herda de uma super classe tem a associação de "ser" a sua super classe, qualquer objeto criado
        a partir de uma classe filha de publicação também sera uma publicação.

    VI. Se o método imprime dados é abstrato na classe Publicação, como é possível imprimir os dados do Livro e do Filme
    quando o loop é executado?
        Ele é executado porque no metodo imprimeDados() de Filme e Livro esta sendo chamado o método imprimeDados() da
        super classe.
        OBS: A classe Publicação e o seu metodo imprimeDados() não foram definidos explicitamento como abstrac no
        codigo, como foi pedido em sala de aula.
 */
