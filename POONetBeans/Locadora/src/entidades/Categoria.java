package entidades;

public class Categoria {
    private int id;
    private String nome;
    private char tipo;
    
    
    
    //gets and sets Nome-------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //gets and sets ID----------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    //gets and sets Tipo--------------
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
}
