package listaAtividadesIII;

import java.time.LocalDate;

public class AppFuncionario {
    public static void main(String[] args) {
        LocalDate dataNascimento1 = LocalDate.of(1990, 6, 13);
        LocalDate dataNascimento2 = LocalDate.of(1988, 11, 25);

        Funcionario funcionario1 = new Funcionario(
            123,
            "João Silva",
            "123456789",
            "987654321",
            "Rua A, 123",
            "São Paulo",
            "Engenheiro",
            "Superior",
            dataNascimento1,
            5000.0f);

        Funcionario funcionario2 = new Funcionario(
            456,
            "Maria Santos",
            "987654321",
            "123456789",
            "Avenida B, 456",
            "Rio de Janeiro",
            "Advogada",
            "Mestrado",
            dataNascimento2,
            6000.0f);

        funcionario1.listar();
        System.out.println();

        funcionario1.alterar(
            789,
            "João da Silva",
            "987654321",
            "123456789",
            "Rua C, 789",
            "Belo Horizonte",
            "Arquiteto",
            "Doutorado",
            dataNascimento1,
            5500.0f);

        funcionario1.listar();
        System.out.println();

        funcionario2.listar();
    }
}
