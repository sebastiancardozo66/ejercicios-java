package ejercicio12;

import javax.swing.JOptionPane;
public class Variables {
//Dadas dos variables numéricas A y B, que el usuario debe teclear,
//se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
    public static void main(String[] args) {

        double A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A:"));

        double B = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B:"));

        double aux;
        aux = A;
        A = B;
        B = aux;

        JOptionPane.showMessageDialog(null,"Después del intercambio:\n" + "A = " + A + "\n" +"B = " + B);
    }
}
