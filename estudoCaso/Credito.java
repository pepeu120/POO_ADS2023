public class Credito extends Operacao {

    public Credito(double valorOperacao) {
        setValor(valorOperacao);
    }

    @Override
    public double operar() {
        return getValor();
    }
}
