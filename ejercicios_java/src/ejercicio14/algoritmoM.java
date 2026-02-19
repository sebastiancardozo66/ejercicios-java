package ejercicio14;

import javax.swing.JOptionPane;
public class algoritmoM {
//Algoritmo que pida dos números e indique si el primero es mayor que el segundo.
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));

        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null,"El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null,"El primer número es menor que el segundo."
            );
        } else {
            JOptionPane.showMessageDialog(null,"Ambos números son iguales.");
        }
    }
}
