package flavio;

public class testePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("IFSP", 40);
        System.out.println(p1.toString());
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Itapetininga");
        p2.setIdade(35);
        System.out.println(p2.toString());
    }
}
