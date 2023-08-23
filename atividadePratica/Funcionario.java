package atividadePratica;

import java.time.LocalDate;

public class Funcionario {
    private String nome, rg, cpf, cargo;
    private LocalDate dataNascimento, dataAdmissao;
    private int matricula;
    protected String endereco;
    private float salario;
    private static int geraMatricula = 0;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public static int getGeraMatricula() {
        return geraMatricula;
    }
    public static void setGeraMatricula(int geraMatricula) {
        Funcionario.geraMatricula = geraMatricula;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String nome, String rg, String cpf, LocalDate dataNascimento, LocalDate dataAdmissao,
            float salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;

        this.matricula = ++geraMatricula;
    }

    public String toString() {
        return String.format("""
            Matricula: %d
            Nome: %s
            RG: %s
            CPF: %s
            Data de nascimento: %s
            Data de admissão: %s
            Salario: %f
            Cargo: %s""",
            getMatricula(), getNome(), getRg(), getCpf(), getDataNascimento(), getDataAdmissao(), getSalario(),
                getCargo());
    }

    public void imprimeDados() {
        System.out.println(this);
    }
}
