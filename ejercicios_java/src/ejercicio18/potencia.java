package ejercicio18;

import javax.swing.JOptionPane;
public class potencia {
//Realiza un algoritmo que calcule la potencia, para ello pide por teclado, la base y el exponente. Pueden ocurrir tres cosas:
//El exponente sea positivo, sólo tienes que imprimir la potencia.
//El exponente sea 0, el resultado es 1.
//El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
     public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));

        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente:"));

        double resultado;

        if (exponente > 0) {
            resultado = Math.pow(base, exponente);

        } else if (exponente == 0) {
            resultado = 1;

        } else {
            resultado = 1 / Math.pow(base, -exponente);
        }

        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
    }
}
