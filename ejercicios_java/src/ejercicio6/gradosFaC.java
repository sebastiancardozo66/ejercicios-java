package ejercicio6;

import javax.swing.JOptionPane;
public class GradosFaC {
//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
    public static void main(String[] args) {

        float fahrenheit = Float.parseFloat(
            JOptionPane.showInputDialog("Ingrese la temperatura en grados Fahrenheit:")
        );

        float celsius = (fahrenheit - 32) * 5 / 9;

        JOptionPane.showMessageDialog(null,
            "La temperatura en grados Celsius es: " + celsius + " °C"
        );
    }
}
