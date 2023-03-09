package flavio;

import java.util.Scanner;

public class testeData {    
    
    public static void main(String[] args) {        
        datas dt = new datas();
        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um Dia: ");
            dt.dia = entrada.nextLine();
            System.out.print("Digite um Mês: ");
            dt.mes = entrada.nextLine();
            System.out.print("Digite um Ano: ");
            dt.ano = entrada.nextLine();                        
        entrada.close();        
        System.out.println("Data formata: "+dt.formatarData());        
    }    
}
