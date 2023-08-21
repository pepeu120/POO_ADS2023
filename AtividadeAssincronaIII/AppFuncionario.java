package atividadeAssincronaIII;

public class AppFuncionario {

    public static void main(String[] args)
    {
        Funcionario f1 = new Funcionario("Zé", 25, 44);

        f1.rg ="12345678";
        f1.cpf ="123456789101";
        f1.salario = 380;
        f1.matricula = 123;
        f1.calculaSalario();
        f1.imprimeDados();

        Funcionario f2 = new Funcionario("Maria", 25, 40);

        f2.numRG ="12345678";
        f2.cpf ="123456789101";
        f2.calculaSalario();
        f2.imprimeDados();
    }
}

/*
    a) O que acontece quando a ação da linha 5 é executada?
        É instanciado um objeto da Funcionario com os  parametros "Zé", 25, 44.

    b) Porque construção das linhas 7 e 8 é permitida?
        Por que os atributos rg e cpf não possuem nenhum modificador de acesso, assim
        utilizam o default, que permite que os atibutos sejam acessados por qualquer classe
        do pacote.

    c) Nas linhas 9 e 10,  acessamos os atributos salário e matricula da funcionário.
    Essa construção implementada nas linhas 9 e 10 é permitida pelo objeto funcionário?
    Justifique a sua resposta.
        Esta construção implementada não esta correta, pois os atributos salario e matricula
        possuem o modificador de acesso private, assim eles só podem ser acessados na classe
        em que foram definidos.
 */