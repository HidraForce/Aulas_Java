package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class deletePessoa {

    public static void main(String[] args) throws SQLException {
        //abrir conexão com o banco de daddos
        Connection conexao = FabricaConexao.getConexao();
        //Inserir valor a ser 'deletado'(pelo usuario)
        String filtro = JOptionPane.showInputDialog("Insira ocodigo do usuario a ser alterado:");
        int code = Integer.parseInt(filtro);
        //comando sql
        String delete = "DELETE FROM pessoas WHERE codigo= ?";
        //injection
        PreparedStatement stmt = conexao.prepareStatement(delete);
        stmt.setInt(1, code);
        //output
        if (stmt.executeUpdate() > 0) {
            System.out.println("Registro removido com sucesso");
        } else {
            System.out.println("Registro não encontrado");
        }
        
    }
}
