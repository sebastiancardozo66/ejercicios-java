package ejercicio30;

import javax.swing.JOptionPane;
public class numerosCon0 {
//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números 
// introducidos son mayores que 0, menores que 0 e iguales a 0.
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos números desea ingresar?"));

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= cantidad; i++) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i + ":"));

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        JOptionPane.showMessageDialog(null,"Resultados:\n" +"Positivos: " + positivos + "\n" +"Negativos: " + negativos + "\n" +"Ceros: " + ceros);
    }
}
