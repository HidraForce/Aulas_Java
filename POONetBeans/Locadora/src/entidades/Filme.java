package entidades;

public class Filme extends Item{
    private String diretor;
    private int duracao;
    
    
    //construtor da classe item com o relacionamento (composição) com categoria
    public Filme(Categoria categoria) {
        super(categoria);
    }
    
    
    //gets and sets Diretor
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //gets and sets Duração
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    @Override
    public String toString() {
        return "Filme \n" + 
                "Id: "+         getId() +"\n"+
                "titulo: " +    getTitulo()+"\n"+
                "Descrição: "+  getDescricao()+"\n"+
                "Preço: "+      getPreco()+"\n"+
                "Nº Dias: "+    getNumeroDias()+"\n"+
                "Categoria: "+  getCategoria()+"\n"+
                "Diretor: "+    diretor+"\n"+
                "Duração: "+    duracao+"\n";
    }    
}
    

