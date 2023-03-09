package classe;

public class Data {
    //criar tres atributos
    int dia;
    int mes;
    int ano;
    
    String formatData(){
                
        String resultado = dia+"/"+mes+"/"+ano;
        return resultado;
    }       
}
