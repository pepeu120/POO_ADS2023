package listaExercicioVI;

public class Livro extends Publicacao {
    private int edicao;
    private String isbn;

    public int getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public Livro (String titulo, String autor, String genero, String editora, int anoPublicacao,
            int qtdDisponivel, int edicao, String isbn) {
        super(titulo, autor, genero, editora, anoPublicacao, qtdDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.printf("""
                Edição: %d
                ISBN: %s
                """, getEdicao(), getIsbn());
    }
}
