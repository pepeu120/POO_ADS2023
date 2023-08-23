package listaExercicioVI;

public class Filme extends Publicacao {
    private String diretor, atorPrincipal, sinopse;
    private int duracaoFilmeMinutos;

    public String getDiretor() {
        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getDuracaoFilmeMinutos() {
        return duracaoFilmeMinutos;
    }

    public Filme(String titulo, String autor, String genero, String editora, int anoPublicacao, int qtdDisponivel,
            String diretor, String atorPrincipal, String sinopse, int duracaoFilmeMinutos) {
        super(titulo, autor, genero, editora, anoPublicacao, qtdDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.duracaoFilmeMinutos = duracaoFilmeMinutos;
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.printf("""
                Diretor: %s
                Ator Principal: %s
                Sinopse: %s
                Duração do filme: %d minutos
                """, getDiretor(), getAtorPrincipal(), getSinopse(), getDuracaoFilmeMinutos());
    }
}