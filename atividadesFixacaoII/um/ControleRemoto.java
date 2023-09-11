package atividadesFixacaoII.um;

public class ControleRemoto {
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void mover() {
        this.brinquedo.mover();
    }
}
