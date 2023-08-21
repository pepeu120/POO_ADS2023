import java.time.LocalDate;

public class Funcionario {
    String nome, cpf, rg;
    private int matricula, horasTrabalhadas;
    private float salarioBase;
    private float salario;
    LocalDate dataContratacao;

    private static int geraMatricula = 0;

    public Funcionario(String nome, int horasTrabalhadas, float salarioBase) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBase = salarioBase;

        this.dataContratacao = LocalDate.now();
        this.matricula = ++geraMatricula;
    
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        this.salario = calculo.getSalarioTotal();
    }

    void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: "+ rg);
        System.out.println("Salario: " + salario);
        System.out.println("Data de contratação: " + dataContratacao);
        System.out.println("Matricula: " + matricula);
        System.out.println("Hora trabalhadas: " + horasTrabalhadas);
        System.out.println("Salario base: " + salarioBase);
    }
}
