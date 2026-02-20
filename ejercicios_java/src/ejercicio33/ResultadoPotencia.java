package ejercicio33;

import javax.swing.JOptionPane;
public class ResultadoPotencia {
//Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia.
//  No se puede utilizar el operador de potencia.
    public static void main(String[] args) {

        double base = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la base (número real):"));

        int exponente = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el exponente (entero positivo):"));

        double resultado = 1;

        if (exponente < 0) {
            JOptionPane.showMessageDialog(null,"Error: El exponente debe ser positivo.");
        } else {

            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }

            JOptionPane.showMessageDialog(null,base + " elevado a " + exponente + " es: " + resultado);
        }
    }
}
