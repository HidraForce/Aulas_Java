package Carro;
//classe generica
public class Carro {
    private int velocidadeMaxima = 100;
    private int velocidadeAtual=0;

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public void acelerar(int fatorAceleracao){
        velocidadeAtual += fatorAceleracao;
        if(velocidadeAtual > velocidadeMaxima){
            velocidadeAtual = 100;
        }
    }
    
    public void acelerar(){
        velocidadeAtual += 5;
        if(velocidadeAtual > velocidadeMaxima){
            velocidadeAtual = 100;
        }
    }    
    
    public void freio(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }            
    }

    @Override
    public String toString() {
        return "Velocidade Atual: "+velocidadeAtual+" Km/h";
    }
    
}
