package condicional;

import javax.swing.JOptionPane;

public class Condicional1 {

    public static void main(String[] args) {
        String mensagem = "";
        //entrada de dados
        String media = JOptionPane.
                showInputDialog("Digite uma média: ").
                replace(",", ".");
        //conversao de texto para numero
        double valor = Double.parseDouble(media);
        if (valor > 10) {
            mensagem = "Nota Inválida !!!";
            //JOptionPane.showMessageDialog(null, "Nota Inválida !!!");
        } else if (valor <= 10 && valor >= 7) {
            mensagem = "Aprovado !!!";
            //JOptionPane.showMessageDialog(null, "Aprovado !!!");
        } else if (valor <= 6.9 && valor >= 5.0) {
            mensagem = "Recuperação !!!";
            //JOptionPane.showMessageDialog(null, "Recuperação !!!");
        } else {
            mensagem = "Reprovado !!!";
            //JOptionPane.showMessageDialog(null, "Reprovado !!!");            
        }
        JOptionPane.showMessageDialog(null, mensagem);            
    }
}
