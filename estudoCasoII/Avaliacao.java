package estudoCasoII;

public class Avaliacao {
    private int peso;
    private float qtdPontos;
    private float[] notas;

    public int getPeso() {
        return peso;
    }

    public float getQtdPontos() {
        return qtdPontos;
    }

    public void setQtdPontos(float qtdPontos) {
        this.qtdPontos = qtdPontos;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public Avaliacao(int peso, float[] notas) {
        this.peso = peso;
        this.notas = notas;
    }
}
