package ejercicio21;

import javax.swing.JOptionPane;
public class anioBisiesto {
//Escribir un programa que lea un año indicar si es bisiesto.
//Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
    public static void main(String[] args) {

        int anio = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese un año:"));

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            JOptionPane.showMessageDialog(null,"El año " + anio + " es bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null,"El año " + anio + " NO es bisiesto.");
        }
    }
}
