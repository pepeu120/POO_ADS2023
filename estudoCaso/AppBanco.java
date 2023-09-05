public class AppBanco {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        Banco banco = new Banco("Correntista1", conta1, "Correntista2", conta2, "Correntista3", conta3);

        banco.creditar("Correntista1", 1000.0d);
        banco.debitar("Correntista2", 500.0d);
        banco.transferir("Correntista3", "Correntista2", 200.0d);

        Correntista correntista3 = banco.getCorrentista("Correntista3");

        System.out.println("Saldo do Correntista1: " + banco.getSaldo("Correntista1"));
        System.out.println("Saldo do Correntista2: " + banco.getSaldo("Correntista2"));
        System.out.println("Saldo do Correntista3: " + correntista3.getContaCorrente().getSaldoAtual());

    }
}
