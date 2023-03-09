package Carro;

public class testeCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();
        carro.acelerar(10);
        System.out.println("Generica: "+carro.toString());
        
        Uno cUno = new Uno();
        cUno.acelerar();
        System.out.println("Uno: "+cUno.toString());
                
        Opala cOpala = new Opala();
        cOpala.acelerar(); //metodo especifico de opala
        cOpala.acelerar(10); //metodo generico de carro
        System.out.println("Opala: "+cOpala.toString());        
    }
}
