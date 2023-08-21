package atividadeAssincronaIII;

public class Calculo {
    private float salarioTotal;

    public float getSalarioTotal() {
        return this.salarioTotal;
    }

    public void calculaSalario(float salarioBase, float horasTrabalhadas) {
        this.salarioTotal = salarioBase * horasTrabalhadas;
    }

}