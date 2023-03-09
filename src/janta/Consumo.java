package janta;

public class Consumo {
    private double peso;
    
    public Consumo(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0){
            this.peso = peso;
        }
    }
    
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }      
}
