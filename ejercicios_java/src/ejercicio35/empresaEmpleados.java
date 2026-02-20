package ejercicio35;

import javax.swing.JOptionPane;
public class EmpresaEmpleados {
//Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. 
// Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además, calcule cuánto pagó la empresa por los N empleados.
    public static void main(String[] args) {

        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));

        double totalPagado = 0;

        for (int i = 1; i <= n; i++) {

            double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado " + i + ":"));

            double pagoHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora del empleado " + i + ":"));

            double sueldo = horas * pagoHora;

            totalPagado += sueldo;

            JOptionPane.showMessageDialog(null,"Sueldo semanal del empleado " + i + ": $" + sueldo);
        }
        JOptionPane.showMessageDialog(null,"Total pagado por la empresa a los " + n + " empleados: $" + totalPagado);
    }
}
