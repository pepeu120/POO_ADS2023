public class Calculo {
    private float salarioTotal = 0f;

    public float getSalarioTotal() {
        return this.salarioTotal;
    }

    public void calculaSalario(float salarioBase, float horasTrabalhadas) {
        this.salarioTotal = salarioBase * horasTrabalhadas;
    }

}