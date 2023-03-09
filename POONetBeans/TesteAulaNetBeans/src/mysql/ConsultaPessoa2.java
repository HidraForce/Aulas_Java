package mysql;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaPessoa2 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
        String filtro = JOptionPane.showInputDialog("Insira o valor da pesquisa");
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + filtro + "%");
        ResultSet resultado = stmt.executeQuery();
        while (resultado.next()) {
            System.out.println(resultado.getInt("codigo") + " ==>" + resultado.getString("nome"));
        }
        conexao.close();
    }
}
