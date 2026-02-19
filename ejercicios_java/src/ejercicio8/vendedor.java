package ejercicio8;

import javax.swing.JOptionPane;
public class vendedor {
//Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá 
// por concepto de comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
    public static void main(String[] args) {

        float sueldoBase = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo base:"));

        float venta1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la primera venta:"));

        float venta2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la segunda venta:"));

        float venta3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la tercera venta:"));

        float comision = (venta1 + venta2 + venta3) * 0.10f;
        float total = sueldoBase + comision;

        JOptionPane.showMessageDialog(null,"Total de comisiones: $" + comision +"\nTotal a recibir este mes: $" + total);
    }
}
