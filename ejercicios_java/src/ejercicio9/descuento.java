package ejercicio9;

import javax.swing.JOptionPane;
public class descuento {
//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
    public static void main(String[] args) {

        double totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la compra:"));

        double descuento = totalCompra * 0.15;
        double totalPagar = totalCompra - descuento;

        JOptionPane.showMessageDialog(null,"Descuento (15%): $" + descuento +"\nTotal a pagar: $" + totalPagar);
    }
}
