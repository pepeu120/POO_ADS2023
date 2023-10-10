package atividadePraticaTratamentoExcecaoII;

import java.util.List;

public class Teacher extends Person {
    private String cpf;
    private String rg;
    private String endereco;
    private List<Person> dependents; 
    
    public Teacher(String nome, int idade, String sexo, String cpf, String rg, String endereco, List<Person> dependents) {
        super(nome, idade, sexo);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dependents = dependents;
    }

    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getEndereco() {
        return endereco;
    }
    public List<Person> getDependents() {
        return dependents;
    }

    public void printDependents() {
        if (haveDependents()) {
            for (Person dependent : getDependents()) {
                System.out.println();
                dependent.printData();
                System.out.println("-------------");
            }
        } else {
            System.out.println("NULL");
        }
    }

    public boolean haveDependents() {
        if (getDependents() != null) {
            return true;
        } else { 
            return false;
        }
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("""
                CPF: %s
                RG: %s
                Endereco: %s
                """, getCpf(), getRg(), getEndereco());
    }

}
