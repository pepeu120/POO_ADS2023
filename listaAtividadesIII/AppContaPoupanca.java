package listaAtividadesIII;

public class AppContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca(
            "João Silva",
            "12345678900",
            "987654321",
            1500.0f,
            12345,
            1001);

        ContaPoupanca conta2 = new ContaPoupanca(
            "Maria Santos",
            "98765432100",
            "123456789",
            2000.0f,
            54321,
            2002);

        conta1.imprimirSaldo();
        System.out.println();

        conta1.Alterar(
            "João da Silva",
            "98765432101",
            "123456788",
            1800.0f,
            54321,
            1001);

        conta1.imprimirSaldo();
        System.out.println();

        conta2.imprimirSaldo();
        System.out.println();

        conta2.setSaldo(conta2.getSaldo() + 500.0f);
        conta2.imprimirSaldo();
    }
}

