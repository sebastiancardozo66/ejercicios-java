package ejercicio32;

import javax.swing.JOptionPane;
public class TablasDeMultiplicar {
//Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.
    public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número:")
        );

        String tabla = "Tabla de multiplicar del " + numero + ":\n\n";

        for (int i = 1; i <= 10; i++) {
            tabla += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}
