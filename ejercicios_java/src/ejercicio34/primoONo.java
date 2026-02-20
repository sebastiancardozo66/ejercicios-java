package ejercicio34;

import javax.swing.JOptionPane;
public class PrimoONo {
//Escribe un programa que diga si un número introducido por teclado es o no primo. 
// Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
     public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero entero:")
        );

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            JOptionPane.showMessageDialog(null,"El numero " + numero + " es PRIMO.");
        } else {
            JOptionPane.showMessageDialog(null,"El numero " + numero + " NO es primo.");
        }
    }
}
