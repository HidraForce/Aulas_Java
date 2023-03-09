package mysql;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class novaPessoa {

    public static void main(String[] args) throws SQLException {
        //criar conexão
        Connection conexao = FabricaConexao.getConexao();
        
        //ler nome do usuario
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        //comando sql
        String sql = "INSERT INTO pessoas(nome,ativo)  VALUE (?, 'S')";
        //processo de adicionar a tabela
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        //stmt.execute(sql);
        //mensagem de excussão sucessiva
        System.out.println("Usuario Incerido com sucesso :) ");
        System.out.println("Comando: "+sql);
        //fechar conexão
        conexao.close();

    }
}
