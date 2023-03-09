package classe;

public class testeProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Caneta para quadro branco";
        p1.preco = 4.00;
        p1.desconto = 0.25;
        
        System.out.println("preço final: "+p1.precoComDesconto());
        
        System.out.println("desconto gerente: "+p1.descontoGerente(0.50));
    }
}
