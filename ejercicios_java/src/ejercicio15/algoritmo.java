package ejercicio15;

import javax.swing.JOptionPane;
public class algoritmo {
//Algoritmo que pida un número y diga si es positivo, negativo o 0.
    public static void main(String[] args) {

        float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null,"El número es positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null,"El número es negativo.");
        } else {
            JOptionPane.showMessageDialog(null,"El número es cero.");
        }
    }
}
