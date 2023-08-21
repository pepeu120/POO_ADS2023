package listaAtividadesIII;

public class AppProfessor {
    public static void main(String[] args) {
        String[] disciplinas = {"Matemática", "Física"};
        
        Professor professor1 = new Professor(
            "João Silva",
            "Doutor",
            "Engenharia",
            40,
            5000.0f,
            disciplinas);

        Professor professor2 = new Professor(
            "Maria Santos",
            "Mestre",
            "Ciências",
            30,
            4000.0f,
            disciplinas);
        
        professor1.listar();

        String[] novasDisciplinas = {"Química", "Biologia"};
        professor1.alterar("João da Silva",
        "Pós-doutor",
        "Química",
        35,
        6000.0f,
        novasDisciplinas);

        professor1.listar();
        System.out.println();
        
        professor2.listar();

        String[] novasDisciplinasMaria = {"História", "Geografia"};
        professor2.alterarDisciplinas(novasDisciplinasMaria);

        professor2.listar();
    }
}
