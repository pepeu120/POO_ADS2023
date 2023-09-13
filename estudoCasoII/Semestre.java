package estudoCasoII;

public class Semestre {
    private Avaliacao avaliacao1, avaliacao2, avaliacao3, avaliacao4;
    private boolean pesoValido, resultado;
    private float media;

    public Semestre() {
        avaliacao1 = new Avaliacao();
        avaliacao2 = new Avaliacao();
        avaliacao3 = new Avaliacao();
        avaliacao4 = new Avaliacao();
    }
}