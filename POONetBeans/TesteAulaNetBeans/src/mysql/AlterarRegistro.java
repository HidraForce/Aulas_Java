package mysql;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AlterarRegistro {

    public static void main(String[] args) throws SQLException {
        //inserir o codigo da pessoa no database
        String codigo = JOptionPane.showInputDialog("Insira o valor da pesquisa");
        int code = Integer.parseInt(codigo);
        //codigos sql
        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        //abertura de conexão
        Connection conexao = FabricaConexao.getConexao();
        //parametro para select
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, code);
        ResultSet r = stmt.executeQuery();
        if (r.next()) {
            System.out.println("O nome atual da pessoa é: " + r.getString("nome"));
            //inserir o nome para qual vai ser mudado
            String novonome = JOptionPane.showInputDialog("Insira o novo nome da pessoa");
            //fechar select
            stmt.close();
            //abrir update
            stmt = conexao.prepareStatement(update);
            //parametros de update
            stmt.setString(1, novonome);
            stmt.setInt(2, code);
            stmt.execute();
            System.out.println("Pessoa alterada com sucesso :)");
            
        } else {
            System.out.println("Pessoa não encontrada :(");
        }
        conexao.close();
        

    }

}
