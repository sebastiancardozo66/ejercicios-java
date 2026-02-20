package ejercicio16;

import javax.swing.JOptionPane;
public class NumeroParImpar {
//Escribe un programa que lea un número e indique si es par o impar.
    public static void main(String[] args) {

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null,"El número es par.");
        } else {
            JOptionPane.showMessageDialog(null,"El número es impar.");
        }
    }
}
