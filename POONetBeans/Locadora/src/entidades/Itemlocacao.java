package entidades;

public class Itemlocacao {
    private int id;
    private double valor;
    private Filme filme;
    private Jogo jogo;


    //gets and sets ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    //gets and sets Jogo
    public Jogo getJogo() {
        return jogo;
    }
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    
    //gets and sets Filme
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    //gets and sets Valor
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
