package entidades;

public class Item {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private int numeroDias;
    private Categoria categoria;
    
    // Método construtor
    public Item(Categoria categoria2) {
        this.categoria = categoria2;
    }
    //gets and sets ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //gets and sets Categoria
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //gets and sets Numero de dias
    public int getNumeroDias() {
        return numeroDias;
    }
    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    //gets and sets Preço
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //gets and sets Descrição
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //gets and sets Titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
