package atividadesFixacaoII.tres;

public class Loja {
    private String nome, ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nomeLoja, String ramo, int anoFundacao) {
        this.nome = nomeLoja;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedor = new Vendedor();
    }

    public void admitirVendedor() {
    }

    public void demitirVendedor() {
    }

}
