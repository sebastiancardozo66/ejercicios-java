package ejercicio5;

import javax.swing.JOptionPane;
public class operacionesMat {
//Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));

        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        JOptionPane.showMessageDialog(null,"Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion + "\nDivisión: " + division);
    }
}