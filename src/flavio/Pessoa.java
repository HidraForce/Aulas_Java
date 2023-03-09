package flavio;

public class Pessoa {
    private int idade;
    private String nome;
    
    //construtor da classe padrão
    Pessoa(){     
    }
    
    //construtor da classe com parametros
    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá sou "+getNome()+" e tenho: "+getIdade();
    }        
}
