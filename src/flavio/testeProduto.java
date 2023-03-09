package flavio;

public class testeProduto {
    public static void main(String[] args) {
        //instanciar a classe
        Produto p1 = new Produto(); 
        p1.nome = "NoteBook";
        p1.preco = 4259.89;
        p1.desconto = 0.25;
        
        double precoFinal =  p1.precoComDesconto();
        System.out.println("Des Padrão ==> Produto: "+p1.nome+" Preço final: "+precoFinal);
        
        double precoGerente = p1.precoDescGerente(0.50);
        System.out.println("Desc Gerente ==> Produto: "+p1.nome+" Preço final: "+precoGerente);
    }    
}
