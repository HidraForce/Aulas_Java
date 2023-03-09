package entidades;

import java.util.ArrayList;
import java.util.Date;

public class locacao {
    private int id;
    private double valor;
    private Date data;
    private cliente cliente;
    private usuario usuario;
    private ArrayList<Itemlocacao> itenslocacao;
    
    //gets and sets ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    //gets and sets Array?
    public ArrayList<Itemlocacao> getItenslocacao() {
        return itenslocacao;
    }
    public void setItenslocacao(ArrayList<Itemlocacao> itenslocacao) {
        this.itenslocacao = itenslocacao;
    }
    
    
    //gets and sets Usuario
    public usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    //gets and sets Cliente
    public cliente getCliente() {
        return cliente;
    }
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    //gets and sets Data
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    //gets and sets Valor
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
