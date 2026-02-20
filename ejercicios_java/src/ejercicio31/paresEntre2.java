package ejercicio31;

import javax.swing.JOptionPane;
public class ParesEntre2 {
//Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        String resultado = "Numeros pares entre " + inicio + " y " + fin + ":\n";

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                resultado += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
