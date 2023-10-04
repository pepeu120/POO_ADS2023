package atividadePraticaTratamentoExcecaoI;

public class App {
    public static void main(String[] args) {
        String resposta;

        do {
            String nome = Teclado.entradaStringTeclado();
            String endereco = Teclado.entradaStringTeclado();
            String matricula = Teclado.entradaStringTeclado();

            Instituicao ifba = new Instituicao();
            ifba.cadastraAluno(nome, endereco, matricula);

            resposta = Teclado.entradaStringTeclado().toUpperCase();

        } while (resposta != "N");

    }
}
