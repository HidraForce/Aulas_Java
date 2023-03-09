package classe;

import java.util.Scanner;

public class testeData {
    //metodo principal da classe
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 99;
        d1.mes = 13;
        d1.ano = 2022;
                
        Data d2 = new Data();
        d2.dia = 30;
        d2.mes = 03;
        d2.ano = 2022;
        
        System.out.println("Dia: "+d1.dia+
                ", Mês: "+d1.mes+
                ", Ano: "+d1.ano);
        
        System.out.println(d2.dia+"/"+d2.mes+"/"+d2.ano);
        
        
        Data d3 = new Data();
        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um dia: ");
            d3.dia = entrada.nextInt();
            System.out.print("Digite um mês: ");
            d3.mes = entrada.nextInt();
            System.out.print("Digite um ano: ");
            d3.ano = entrada.nextInt();
        entrada.close();
        System.out.println("Data: "+d3.formatData());
    }
}
