package listaAtividadesIII;

import java.time.LocalDate;

public class Funcionario {
    // Attributes
    private int matricula;
    private String
        nome,
        rg,
        cpf,
        endereco,
        localNascimento,
        profissao,
        grauInstrucao;
    private LocalDate dataNascimento;
    private float salario;

    // Getter and Setter int
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Getters and Setters String
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLocalNascimento() {
        return this.localNascimento;
    }
    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getProfissao() {
        return this.profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getGrauInstrucao() {
        return this.grauInstrucao;
    }
    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    // Getters and Setters Date
    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Getters and Setters float
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Constructor
    public Funcionario(
        int matricula,
        String nome,
        String rg,
        String cpf,
        String endereco,
        String localNascimento,
        String profissao,
        String grauInstrucao,
        LocalDate dataNascimento,
        float salario) {
            this.matricula = matricula;
            this.nome = nome;
            this.rg = rg;
            this.cpf = cpf;
            this.endereco = endereco;
            this.localNascimento = localNascimento;
            this.profissao = profissao;
            this.grauInstrucao = grauInstrucao;
            this.dataNascimento = dataNascimento;
            this.salario = salario;
    }

    // Methods
    public void alterar(
        int matricula,
        String nome,
        String rg,
        String cpf,
        String endereco,
        String localNascimento,
        String profissao,
        String grauInstrucao,
        LocalDate dataNascimento,
        float salario) {
            setMatricula(matricula);
            setNome(nome);
            setRg(rg);
            setCpf(cpf);
            setEndereco(endereco);
            setLocalNascimento(localNascimento);
            setProfissao(profissao);
            setGrauInstrucao(grauInstrucao);
            setDataNascimento(dataNascimento);
            setSalario(salario);
        }

    public void listar() {
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Local de nascimento: " + getLocalNascimento());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Grau de instrução: " + getGrauInstrucao());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Salario: " + getSalario());
    }
}
