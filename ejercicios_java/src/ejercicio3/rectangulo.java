package ejercicio3;

import javax.swing.JOptionPane;
//Calcular el perímetro y área de un rectángulo dada su base y su altura.
public class Rectangulo {
    public static void main(String[] args) {
        String baseTexto = JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo:");
        String alturaTexto = JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo:");
        
        Float base = Float.parseFloat(baseTexto);
        Float altura = Float.parseFloat(alturaTexto);
        
        Float area = base * altura;
        Float perimetro = 2 * (base + altura);
        
        JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimetro: " + perimetro);
    }
}
