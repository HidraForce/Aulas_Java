package DAO;

import javax.swing.JOptionPane;

public class DAO_Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        //ler nome do usuario
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        //comando sql
        String sql = "INSERT INTO pessoas (nome, ativo) VALUES (?, 'S')";
        //output
        System.out.println("codigo gerado: "+ dao.incluir(sql, nome));

        //output padrão
        /*System.out.println("codigo gerado: "+ dao.incluir(sql, "Uno Rosa"));
        System.out.println("codigo gerado: "+ dao.incluir(sql, "Uno Verde"));
        System.out.println("codigo gerado: "+ dao.incluir(sql, "Uno Amarelo"));
        System.out.println("codigo gerado: "+ dao.incluir(sql, "Uno Azul"));*/


        dao.close();
    }
}
