package janta;

public class Jantar {
    public static void main(String[] args) {
        Consumo co = new Consumo(99.65);        
        System.out.println("Consumo inicial: "+co.getPeso());
        Arroz item1 = new Arroz(0.2);
        co.comer(item1);
        System.out.println("Consumo 1: "+co.getPeso());
        Arroz item2 = new Arroz(0.1);
        co.comer(item2);
        System.out.println("Consumo 2: "+co.getPeso());
        Sorvete item3 = new Sorvete(0.4);
        co.comer(item3);
        System.out.println("Consumo 3: "+co.getPeso());
    }        
}
