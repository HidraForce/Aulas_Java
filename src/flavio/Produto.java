package flavio;

public class Produto {
    String nome;
    double preco;
    double desconto;
    
    double precoComDesconto(){
        return preco  * (1 - desconto);
    }
    
    double precoDescGerente(double descontoGerente){
        return preco * ( 1 - descontoGerente);
    }
}
