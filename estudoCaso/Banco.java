// Esta classe foi inteiramente copiada do exercicio

public class Banco {
    Correntista c1, c2, c3;

    public Banco(String correntista1, ContaCorrente co1, String correntista2, ContaCorrente co2, String correntista3,
            ContaCorrente co3) {

        c1 = new Correntista(correntista1, co1);
        c2 = new Correntista(correntista2, co2);
        c3 = new Correntista(correntista3, co3);
    }

    public Correntista getCorrentista(String nome) {
        if (c1.getNome().equals(nome)) {
            return c1;
        }
        if (c2.getNome().equals(nome)) {
            return c2;
        }
        if (c3.getNome().equals(nome)) {
            return c3;
        }
        return null;
    }

    public void debitar(String nome_correntista, double valor) {
        Debito d = new Debito(valor);
        getCorrentista(nome_correntista).getContaCorrente().executarOperacao(d);
    }

    public void creditar(String nome_correntista, double valor) {
        Credito c = new Credito(valor);
        getCorrentista(nome_correntista).getContaCorrente().executarOperacao(c);
    }

    public double getSaldo(String nome_correntista) {
        return getCorrentista(nome_correntista).getContaCorrente().getSaldoAtual();
    }

    public void transferir(String nome_correntista_origem, String nome_correntista_destino, double valor) {
        debitar(nome_correntista_origem, valor);
        creditar(nome_correntista_destino, valor);
    }
}
