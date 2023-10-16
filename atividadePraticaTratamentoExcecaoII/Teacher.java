package atividadePraticaTratamentoExcecaoII;

import java.util.List;

public class Teacher extends Person {
    private String cpf;
    private String rg;
    private String address;
    private List<Dependents> dependents;

    public Teacher(String nome, int idade, String sexo, String cpf, String rg, String address,
            List<Dependents> dependents) {
        super(nome, idade, sexo);
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
        this.dependents = dependents;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getAddress() {
        return address;
    }

    public List<Dependents> getDependents() {
        return dependents;
    }

    public void addDependents(Dependents dependent) {
        dependents.add(dependent);
    }

    public void printDependents() {
        if (haveDependents()) {
            for (Dependents dependent : getDependents()) {
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
                Address: %s
                Dependents:
                    """, getCpf(), getRg(), getAddress());
        if (haveDependents()) {
            printDependents();
        } else {
            System.out.println("Does not have dependents!");
        }
    }
}
