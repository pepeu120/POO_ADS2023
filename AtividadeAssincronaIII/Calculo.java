public class Calculo {
    private float salarioTotal = 0f;

    public float getSalarioToal() {
        return this.salarioTotal;
    }

    public void calculaSalario(float salarioBase, float horasTrabalhadas) {
        this.salarioTotal = salarioBase * horasTrabalhadas;
    }

}