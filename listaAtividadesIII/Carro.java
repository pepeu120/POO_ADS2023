public class Carro {
    // Attributes
    private int 
        codigo,
        anoFabricacao,
        qtdPortas,
        qtdDisponivel;
    private String 
        marca,
        cor,
        modelo,
        tipoCombustivel;
    private float preco;
    private boolean completo;
    

    // Getters and Setters int
    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getQtdPortas() {
        return this.qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdDisponivel() {
        return this.qtdDisponivel;
    }
    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    // Getters and Setters String
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getter and Setter float
    public float getPreco() {
        return this.preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Getter and Setter float
    public boolean isCompleto() {
        return this.completo;
    }
    public void setCompleto(boolean completo) {
        this.completo = completo;
    }


    // Constructor
    public Carro(
        int codigo,
        int anoFabricacao,
        int qtdPortas,
        int qtdDisponivel,
        String marca,
        String cor,
        String modelo,
        String tipoCombustivel,
        float preco,
        boolean completo) {
            this.codigo = codigo;
            this.anoFabricacao = anoFabricacao;
            this.qtdPortas = qtdPortas;
            this.qtdDisponivel = qtdDisponivel;
            this.marca = marca;
            this.cor = cor;
            this.modelo = modelo;
            this.tipoCombustivel = tipoCombustivel;
            this.preco = preco;
            this.completo = completo;
        }


    public void Alterar(
        int codigo,
        int anoFabricacao,
        int qtdPortas,
        int qtdDisponivel,
        String marca,
        String cor,
        String modelo,
        String tipoCombustivel,
        float preco,
        boolean completo) {
            setCodigo(codigo);
            setAnoFabricacao(anoFabricacao);
            setQtdPortas(qtdPortas);
            setQtdDisponivel(qtdDisponivel);
            setMarca(marca);
            setCor(cor);
            setModelo(modelo);
            setTipoCombustivel(tipoCombustivel);
            setPreco(preco);
            setCompleto(completo);
        }


    public void listar() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Número de Portas: " + getQtdPortas());
        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
        System.out.println("Quantidade Disponível: " + getQtdDisponivel());
        System.out.println("Preço: " + getPreco());
        System.out.println("Completo: " + isCompleto());
        System.out.println();
    }
}
