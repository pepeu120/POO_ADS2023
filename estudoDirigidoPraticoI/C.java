import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digite um numero: ");
        int valor1 = teclado.nextInt();
        
        System.out.print("digite outro numero: ");
        int valor2 = teclado.nextInt();
        teclado.close();

        if (valor1 % valor2 == 0) {
            System.out.printf("%d é divisivel por %d", valor1, valor2);
        } else {
            System.out.printf("%d não é divisivel por %d", valor1, valor2);
        }
    }
}
