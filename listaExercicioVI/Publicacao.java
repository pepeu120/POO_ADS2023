package listaExercicioVI;

// Foi pedido para não usar "abstract"
public abstract class Publicacao {
    private String titulo, autor, genero, editora;
    private int anoPublicacao, qtdDisponivel;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    // Constructor
    public Publicacao(String titulo, String autor, String genero, String editora, int anoPublicacao,
            int qtdDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.qtdDisponivel = qtdDisponivel;
    }

    public abstract void imprimeDados();
}
