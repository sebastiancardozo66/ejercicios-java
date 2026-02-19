package ejercicio1;

import javax.swing.JOptionPane;
//Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
public class nombresaludo {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?");
        System.out.println("Hola " + nombre);
    }
}
