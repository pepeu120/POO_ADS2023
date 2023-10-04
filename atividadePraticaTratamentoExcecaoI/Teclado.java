package atividadePraticaTratamentoExcecaoI;

import java.util.Scanner;

public class Teclado {

    public static String entradaStringTeclado() {
        Scanner teclado = new Scanner(System.in);

        String palavra = teclado.next();

        //teclado.close();

        return palavra;
    }
}
