package ejercicio4;

import javax.swing.JOptionPane;
public class trianguloRectangulo {
//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
     public static void main(String[] args) {
        Float cateto1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer cateto:"));

        Float cateto2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo cateto:"));

        Float hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        JOptionPane.showMessageDialog(null,"La hipotenusa es: " + hipotenusa);
    }
}

