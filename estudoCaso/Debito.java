public class Debito extends Operacao {

    public Debito(double valorOperacao) {
        setValor(valorOperacao);
    }

    @Override
    public double operar() {
        return getValor() * -1;
    }
}
