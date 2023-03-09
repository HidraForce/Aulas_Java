package flavio;

public class Consumo {
    private double peso;

    public Consumo(double peso) {
        setPeso(peso);
    }
       
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >=0){
            this.peso = peso;
        }
    }
    
    //polimorfismo estatico
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    
    //polimorfismo dinamico
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
