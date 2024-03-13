import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que exibe os primeiros 100 números naturais. Faça versões usando for, while e do/while.
        String output = "Primeiros 100 números naturais (usando for):\n";
        for (int i = 0; i < 100; i++) {
            output += i + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

