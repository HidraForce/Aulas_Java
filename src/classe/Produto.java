package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;
    
    //criar metodo de desconto do produto sem parametro
    double precoComDesconto(){
        double resultado = preco * (1-desconto);
        return resultado;
    }
    //criar metodo de desconto do produto com parametro
    double descontoGerente(double descontGerente){
        double resultado = preco * (1-descontGerente);
        return resultado;
    }   
}










