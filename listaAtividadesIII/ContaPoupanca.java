package listaAtividadesIII;

public class ContaPoupanca {
    // Atributes
    private String 
        nomeCorrentista,
        cpf,
        rg;
    private float saldo;
    private int
        numero,
        agencia;

    // Getters and Setters String
    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    // Getter and Setter float
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Getters and Setter int
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    // Constructor
    public ContaPoupanca(
        String nomeCorrentista,
        String cpf,
        String rg,
        float saldo,
        int numero,
        int agencia) {
            this.nomeCorrentista = nomeCorrentista;
            this.cpf = cpf;
            this.rg = rg;
            this.saldo = saldo;
            this.numero = numero;
            this.agencia = agencia;
    }


    public void Alterar(
        String nomeCorrentinsta,
        String cpf,
        String rg,
        float saldo,
        int numero,
        int agencia) {
            setNomeCorrentista(nomeCorrentinsta);
            setCpf(cpf);
            setRg(rg);
            setSaldo(saldo);
            setNumero(numero);
            setAgencia(agencia);
        }

        
    public void imprimirSaldo() {
        System.out.printf("Saldo: R$%.2f", getSaldo());
    }
}
