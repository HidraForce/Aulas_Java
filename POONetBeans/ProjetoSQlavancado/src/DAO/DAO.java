package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAO {

    //variavel da conexao
    private Connection conexao;

    //metodo para verifcar a conexão
    private Connection getConexao(){
        try {
            if(conexao != null && conexao.isClosed()){//testar se a conexão está aberta 
                return conexao; //retorna a resposta
            }
        
        } catch (SQLException e) {
        
        }
        conexao =  FabricaConexao.getConexao();//se a conexão estiver fechada ele ira abrir
        return conexao;
    }
    //metodso para adicionar atributo no comando SQL
    /*le o tipo das varaveis das colunas*/
    private void adicionarAtributos (PreparedStatement stmt, Object[] atributos)throws SQLException{
        int indice = 1;//incrementador
        //loop para andar no objeto
        for(Object atributo:atributos ){
            if(atributo instanceof String){
                stmt.setString(indice, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(indice, (Integer) atributo);
            }
            indice++;
        }

    }
    //incluir no banco
    public int incluir(String sql, Object ... atributos ){
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);
            if(stmt.executeUpdate()>0){
                ResultSet resultado = stmt.getGeneratedKeys();
                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }
    //fechar conexao
    public void close(){
        try {
            getConexao().close();
        } catch (Exception e) {
            
        } finally{
            conexao = null;
        }
    }
}
