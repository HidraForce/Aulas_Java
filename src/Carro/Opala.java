package Carro;

public class Opala extends Carro {
    public void acelerar(){
        setVelocidadeAtual(getVelocidadeAtual()+30);                
        if(getVelocidadeAtual() > getVelocidadeMaxima()){
            setVelocidadeAtual(100);
        }
    }            
}
