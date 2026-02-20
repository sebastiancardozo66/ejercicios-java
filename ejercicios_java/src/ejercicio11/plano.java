package ejercicio11;

import javax.swing.JOptionPane;
public class Plano {
//Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
    public static void main(String[] args) {

        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x1:"));

        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y1:"));

        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x2:"));

        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y2:"));

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null,"La distancia entre los puntos es: " + distancia);
    }
}
