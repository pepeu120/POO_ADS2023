package listaAtividadesIII;

public class Calculadora {
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a - b;
        } else {
            System.out.println("ERRO! Não é possivel dividir por 0");
            return Double.NaN;
        }        
    }
}
