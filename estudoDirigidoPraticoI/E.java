import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tempo de aquecimento em segundos: ");
        int entradaSegundos = teclado.nextInt();

        teclado.close();
        
        int horas = entradaSegundos / 3600;
        int minutos = (entradaSegundos % 3600) / 60;
        int segundos = entradaSegundos % 60;

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
    }    
}
