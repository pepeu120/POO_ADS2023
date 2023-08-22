package listaExercicioVI;

public class Livro extends Publicacao {
    private int edicao;
    private String isbn;

    public Livro (String titulo, String autor, String genero, String editora, int anoPublicacao,
        int qtdDisponivel, int edicao, String isbn) {
        super(titulo, autor, genero, editora, anoPublicacao, qtdDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;    
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Edição: "+this.edicao+"\nISBN: "+this.isbn);
    }
}
