package ejercicio19;

import javax.swing.JOptionPane;
public class NumerosOrdenados {
//Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)
    public static void main(String[] args) {

        double a = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el primer número:")
        );

        double b = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el segundo número:")
        );

        double c = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el tercer número:")
        );

        double mayor, medio, menor;

        if (a >= b && a >= c) {
            mayor = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            mayor = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        JOptionPane.showMessageDialog(null,"Orden de mayor a menor:\n" +mayor + " , " + medio + " , " + menor);
    }
}
