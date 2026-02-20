package ejercicio28;

import javax.swing.JOptionPane;
import java.util.Random;
public class AdivinanzaNumero {
//Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y 
// va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo).
//  El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el
//  número que había generado.
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int intentos = 10;
        boolean acertado = false;

        while (intentos > 0 && !acertado) {

            int numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Adivina el numero (1 - 100)\n" +"Intentos restantes: " + intentos));

            if (numero == numeroSecreto) {
                acertado = true;
                JOptionPane.showMessageDialog(null,"¡Correcto!\n" +"Has acertado en " + (11 - intentos) + " intentos.");
            } else if (numero < numeroSecreto) {
                intentos--;
                JOptionPane.showMessageDialog(null,"El numero secreto es MAYOR.\n" +"Intentos restantes: " + intentos);
            } else {
                intentos--;
                JOptionPane.showMessageDialog(null,"El numero secreto es MENOR.\n" +"Intentos restantes: " + intentos);
            }
        }
        if (!acertado) {
            JOptionPane.showMessageDialog(null,"Se acabaron los intentos.\n" +"El numero era: " + numeroSecreto);
        }
    }
}
