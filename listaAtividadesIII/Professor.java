package listaAtividadesIII;


public class Professor {
    // Attributes
    private String 
        nome,
        titulacao,
        formacao;
    private int cargaHoraria;
    private float salario;
    private String[] disciplinas;

    // Getters and Setters String
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return this.titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getFormacao() {
        return this.formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    // Getter and Setter int
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Getter and Setter float
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Getters and Setters String[]
    public String[] getDisciplinas() {
        return this.disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    // Constructor
    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, float salario,
            String[] disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    // Methods
    public void alterar(
        String nome,
        String titulacao,
        String formacao,
        int cargaHoraria,
        float salario,
        String[] disciplinas) {
            setNome(nome);
            setTitulacao(titulacao);
            setFormacao(formacao);
            setCargaHoraria(cargaHoraria);
            setSalario(salario);
            setDisciplinas(disciplinas);
    }

    public void alterarDisciplinas(String[] novasDisciplinas) {
        setDisciplinas(novasDisciplinas);
    }

    public void listar() {
        System.out.println("Nome: " + getNome());
        System.out.println("titulação: " + getTitulacao());
        System.out.println("Formação: " + getFormacao());
        System.out.println("Carga Horaria: " + getCargaHoraria());
        System.out.println("Salario: R$" + getSalario());
        System.out.print("Disciplinas: [");

        for (String disciplina : getDisciplinas()) {
            System.out.print(disciplina + ", ");
        }

        System.out.println("\b\b]");
    }
 }