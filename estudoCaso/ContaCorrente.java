public class ContaCorrente {

    private double saldoAtual = 0d;

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void executarOperacao(Operacao operacao) {
        this.saldoAtual += operacao.operar();
    }
}
