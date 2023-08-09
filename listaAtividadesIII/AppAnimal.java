import java.time.LocalDate;

public class AppAnimal {
    public static void main(String[] args) {
        LocalDate dataNascimento1 = LocalDate.of(2018, 3, 15);
        LocalDate dataNascimento2 = LocalDate.of(2020, 8, 10);

        Animal animal1 = new Animal(
            "Leão",
            "Simba",
            "Savana",
            dataNascimento1,
            12345);

        Animal animal2 = new Animal(
            "Elefante",
            "Dumbo",
            "Floresta",
            dataNascimento2,
            67890);

        animal1.listar();
        System.out.println();

        animal1.alterar(
            "Tigre",
            "Rajah",
            "Selva",
            dataNascimento1,
            54321);

        animal1.listar();
        System.out.println();

        animal2.listar();
    }
}
