package atividadePratica;

import java.time.LocalDate;

public class AppFaculdade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João da Silva", "1234567", "987654321",
            LocalDate.of(1990, 5, 15), LocalDate.of(2021, 3, 1),
            5000.0f);

        Professor professor = new Professor("Ana Souza", "9876543", "123456789",
            LocalDate.of(1985,8, 10), LocalDate.of(2019, 5, 20),
            6000.0f, "Doutorado em Física");

        funcionario.imprimeDados();
        professor.imprimeDados();
    }

}
