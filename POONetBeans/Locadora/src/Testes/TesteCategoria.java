package Testes;

import Persistencias.categoriaDAO;
import entidades.Categoria;

public class TesteCategoria {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Ação");
        categoria.setTipo('F');

        categoriaDAO.inserir(categoria);
        
         /*try{
            categoriaDAO.inserir(categoria);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }*/


    }
}
