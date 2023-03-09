package conversao;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        String valor1 = JOptionPane.
                showInputDialog("Digite o 1º valor");
        String valor2 = JOptionPane.
                showInputDialog("Digite o 2º valor");        
        System.out.println(valor1 + valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        System.out.println("Soma: " + (numero1 + numero2));
    }
}
