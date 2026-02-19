package ejercicio22;

import javax.swing.JOptionPane;
public class diasMes {
//Escribe un programa que reciba un mes y diga cuantos dias tiene este mes.
    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes (1-12):"));

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:JOptionPane.showMessageDialog(null,"Este mes tiene 31 días.");
                break;

            case 4:
            case 6:
            case 9:
            case 11:JOptionPane.showMessageDialog(null,"Este mes tiene 30 días.");
                break;

            case 2:JOptionPane.showMessageDialog(null,"Este mes tiene 28 días (29 si es bisiesto).");
                break;

            default:JOptionPane.showMessageDialog(null,"Mes inválido. Ingrese un valor entre 1 y 12.");
        }
    }
}
