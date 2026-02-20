package ejercicio7;

import javax.swing.JOptionPane;
public class MediaDe3 {
//Calcular la media de tres números pedidos por teclado
    public static void main(String[] args) {

        float n1 = Float.parseFloat(
            JOptionPane.showInputDialog("Ingrese el primer numero:")
        );

        float n2 = Float.parseFloat(
            JOptionPane.showInputDialog("Ingrese el segundo numero:")
        );

        float n3 = Float.parseFloat(
            JOptionPane.showInputDialog("Ingrese el tercer numero:")
        );

        float media = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null,
            "La media es: " + media
        );
    }
}
