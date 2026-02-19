package ejercicio29;

import javax.swing.JOptionPane;
public class hasta0 {
//Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.
    public static void main(String[] args) {

        double numero;
        double suma = 0;
        int contador = 0;

        do {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero (0 para terminar):"));

            if (numero != 0) {
                suma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = suma / contador;

            JOptionPane.showMessageDialog(null,"Suma total: " + suma +"\nCantidad de numeros: " + contador +"\nMedia: " + media);
        } else {
            JOptionPane.showMessageDialog(null,"No se ingresaron numeros.");
        }
    }
}
