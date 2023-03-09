package entidades;

public class Jogo extends Item{

    private int memoria;
    private String tipo;
    

    //construtor da classe item com o relacionamento (composição) com categoria     
    public Jogo(Categoria categoria2) {
        super(categoria2);
        //TODO Auto-generated constructor stub
    }

    //gets and sets Tipo
    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //gets and sets Memoria
    public int getMemoria() {
        return memoria;
    }


    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
