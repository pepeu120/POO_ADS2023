package listaAtividadesIII;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
            1,
            2022,
            4,
            10,
            "Toyota",
            "Prata",
            "Corolla",
            "Gasolina",
            80000.0f,
            true);

        Carro carro2 = new Carro(
            2,
            2023,
            2,
            5,
            "Honda",
            "Vermelho",
            "Civic",
            "Etanol",
            75000.0f,
            false);

        carro1.listar();
        carro2.listar();

        // Alterar informações do carro1
        carro1.Alterar(
            1,
            2022,
            4,
            8,
            "Toyota",
            "Branco",
            "Corolla",
            "Gasolina",
            85000.0f,
            true);

        carro1.listar();
    }
}
