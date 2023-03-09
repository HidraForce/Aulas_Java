package Persistencias;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;


public class Conexao {
    public static Connection getConexao(){
        try {
            final String url = "jdbc:mysql://localhost:3306/locadora?zeroDateTImeBehavior=CONVERT_TOOL_NULL";
            final String usuario = "root";
            final String senha = "";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




   /* public static Connection getConexao() {
        try {
           Properties prop = getProperties();
           //variaveis relativas das infos do database
           final String url = prop.getProperty("banco.url");
           final String user = prop.getProperty("banco.user");
           final String password =prop.getProperty("banco.password");
           //executar conexao 
           return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            //retornar conexão
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
    }
    

    //chamr o arquivo propriedades
    private static Properties getProperties() throws IOException{
        //usar o arquivo propriedades
        Properties prop = new Properties();
        String caminho ="src\\conexao.properties";
        //carregar o arquivo propriedades
        prop.load(Conexao.class.getResourceAsStream(caminho));
        return prop;

    }*/
}


