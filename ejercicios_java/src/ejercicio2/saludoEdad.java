package ejercicio2;

import javax.swing.JOptionPane;
//Escribir un programa que pregunte al usuario su edad, y luego le diga cuántos años tendrá en 10 años.
public class saludoEdad {
    public static void main(String[] args) {
        String edadTexto = JOptionPane.showInputDialog(null, "¿Cuántos años tienes?");
        
        int edad = Integer.parseInt(edadTexto);
        int edadFutura = edad + 10;

        JOptionPane.showMessageDialog(null, "En 10 años tendrás " + edadFutura + " años.");
    }
}
