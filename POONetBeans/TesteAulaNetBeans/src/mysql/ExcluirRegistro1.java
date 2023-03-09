package mysql;

//impot list
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ExcluirRegistro1 {
    public static void main(String[] args) throws SQLException{
        //abrir conexão
        Connection conexao = FabricaConexao.getConexao();
        //user input
        String input = JOptionPane.showInputDialog("Insira o codigo do usuario o qual deseja mudar o status:");
        //converter input para INT
        int codigo = Integer.parseInt(input);
        //Comando SQL
        String sql = "UPDATE pessoas SET ativo = 'N' WHERE codigo = ?";
        //injection
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
       //output
        if (stmt.executeUpdate() > 0) {
            String output3 = "Status alterado com suicesso :)";
            JOptionPane.showMessageDialog(null, output3);
        } else {
            String output4 = "Houve um erro, e não foi possivel fazer a alteração :(";
            JOptionPane.showMessageDialog(null, output4);
        }
        //fechar conexao e statement
        conexao.close();
        stmt.close();
    }
}
