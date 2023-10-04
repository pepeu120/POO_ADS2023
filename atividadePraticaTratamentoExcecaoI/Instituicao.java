package atividadePraticaTratamentoExcecaoI;

import java.util.List;
import java.util.ArrayList;

public class Instituicao {
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastraAluno(String nome, String endereco, String matricula) {
        try {
            Aluno novoAluno = new Aluno(nome, endereco, matricula);

            if (!alunos.isEmpty()){
                for (Aluno aluno : alunos) {
                    if (aluno.getMatricula() == novoAluno.getMatricula()) {
                        throw new MatriculaDuplicadaException("MATRICULA DUPLICADA: Está matrícula ja esta no banco de dados.");
                    }
                }
            }

            alunos.add(novoAluno);
            System.out.println("Aluno Cadastrado com sucesso.");
        } catch (MatriculaDuplicadaException e) {
            System.out.println(e.getMessage());
        }
    }
}
