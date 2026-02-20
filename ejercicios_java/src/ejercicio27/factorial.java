package ejercicio27;

import javax.swing.JOptionPane;
public class Factorial {
//Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los enteros entre 1 y el propio número
//  y se representa por el número seguido de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120),
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo:"));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null,"Error: No se puede calcular el factorial de un numero negativo.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            JOptionPane.showMessageDialog(null,"El factorial de " + numero + " es: " + factorial);
        }
    }
}
