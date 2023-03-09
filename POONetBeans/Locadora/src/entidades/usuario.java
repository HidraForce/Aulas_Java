package entidades;

public class usuario {
     private int id;
    private String nome;
    private String login;
    private String senha;
    
    
    //get and set ID ----------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //-------------------------
   
    //gets and sets Senha------
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //-------------------------
    
    //gets and sets login------
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    //-------------------------
    
    //get and sets Nome--------
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //--------------------------


}
