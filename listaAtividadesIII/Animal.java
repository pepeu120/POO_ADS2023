package listaAtividadesIII;

import java.time.LocalDate;

public class Animal {
    // Attributes
    String
        especie,
        nome,
        localNascimento;
    LocalDate dataNascimento;
    int numeroRegistro;
    
    // Getters and Setters String
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalNascimento() {
        return this.localNascimento;
    }
    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    // Getter and Setter Date
    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Getter and Setter int
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    // Constructor
    public Animal(
        String especie,
        String nome,
        String localNascimento,
        LocalDate dataNascimento,
        int numeroRegistro) {
            this.especie = especie;
            this.nome = nome;
            this.localNascimento = localNascimento;
            this.dataNascimento = dataNascimento;
            this.numeroRegistro = numeroRegistro;
    }

    // Methods
    public void alterar(
        String especie,
        String nome,
        String localNascimento,
        LocalDate dataNascimento,
        int numeroRegistro) {
            setEspecie(especie);
            setNome(nome);
            setLocalNascimento(localNascimento);
            setDataNascimento(dataNascimento);
            setNumeroRegistro(numeroRegistro);
    }

    public void listar() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nome: " + getNome());
        System.out.println("Local de nascimento: " + getLocalNascimento());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Numero de registro: " + getNumeroRegistro());
    }
}
