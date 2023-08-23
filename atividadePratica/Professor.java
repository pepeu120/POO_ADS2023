package atividadePratica;

import java.time.LocalDate;

public class Professor extends Funcionario {
    private String formacao;
    private String[] disciplinas;

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Professor(String nome, String rg, String cpf, LocalDate dataNascimento, LocalDate dataAdmissao,
            float salario, String formacao) {
        super(nome, rg, cpf, dataNascimento, dataAdmissao, salario);
        this.formacao = formacao;
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.print("Formação: " + this.formacao + "\nDisciplina(s): [");

        if (disciplinas != null) {
            for (String disciplina : this.disciplinas) {
                System.out.print(disciplina + ", ");
            }
            System.out.println("\b\b]");
        } else {
            System.out.println("]");
        }
    }
}

/*
    a. Por que foi possível acessar diretamente o atributo endereço através do
    objeto do tipo professor?
        Porque a classe Professor é uma subclasse de Funcionario, sendo assim ela herda todos os seus atributos e
        comportamentos
    b. Qual o valor da matrícula do objeto do tipo funcionário e do objeto do tipo
    professor?
        No objeto funcionario é 1 e no professor 2, isso porque o atributo geraMatricula da classe Funcionario foi incrementado, na instanciação do objeto e depois herdado pelo objeto professor.
    c. Por que foi possível imprimir os valores armazenados nos atributos
    privados na classe Funcionário através do método imprimeDados() da
    classe Professor, uma vez que método imprimeDados() foi sobrescrito na
    classe filha?
        Porque foi chamado o metodo da superclasse dentro do metodo imprimeDados da subclasse.
 */
