package atividadePraticaTratamentoExcecaoI;

public class Aluno {
    private String nome, endereco, matricula;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public Aluno(String nome, String endereco, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

}
