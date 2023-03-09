package flavio;

public class Jantar {
    public static void main(String[] args) {
        //instancia classe e atribuir valroes
        Consumo co = new Consumo(99.65);        
        //mostra o peso atual
        System.out.println(co.getPeso());
        //instancia classe e atribuir valroes
        Arroz item1 = new Arroz(0.2);
        Arroz item2 = new Arroz(0.1);        
        co.comer(item1);//adicionar o novo consumo
        co.comer(item2);//adicionar o novo consumo
        //mostra o peso atual
        System.out.println(co.getPeso());
        Sorvete sobr = new Sorvete(0.4);//adicionar o novo consumo
        co.comer(sobr);
        //mostra o peso atual
        System.out.println(co.getPeso());
    }    
}
