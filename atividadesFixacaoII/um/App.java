package atividadesFixacaoII.um;

public class App {
    public static void main(String[] args) {
        Brinquedo caminhao = new Caminhao();
        Brinquedo helicoptero = new Helicoptero();
        Brinquedo navio = new Navio();

        ControleRemoto controleRemotoCaminhao = new ControleRemoto(caminhao);
        ControleRemoto controleRemotoHelicoptero = new ControleRemoto(helicoptero);
        ControleRemoto controleRemotoNavio = new ControleRemoto(navio);

        controleRemotoCaminhao.mover();

        controleRemotoHelicoptero.mover();

        controleRemotoNavio.mover();
    }
}
