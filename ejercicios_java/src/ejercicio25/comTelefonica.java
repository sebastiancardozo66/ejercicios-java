package ejercicio25;

import javax.swing.JOptionPane;
public class comTelefonica {
//La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros 
// cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos.
//  Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo 
// para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
    public static void main(String[] args) {

        double minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duración de la llamada (en minutos):"));

        String dia = JOptionPane.showInputDialog("Ingrese el día (domingo u otro):").toLowerCase();

        String turno = "";
        if (!dia.equals("domingo")) {
            turno = JOptionPane.showInputDialog("Ingrese el turno (mañana o tarde):").toLowerCase();
        }

        double costo = 0;

        if (minutos <= 5) {
            costo = 1;
        } else if (minutos <= 8) {
            costo = 1 + (minutos - 5) * 0.80;
        } else if (minutos <= 10) {
            costo = 1 + (3 * 0.80) + (minutos - 8) * 0.70;
        } else {
            costo = 1 + (3 * 0.80) + (2 * 0.70) + (minutos - 10) * 0.50;
        }

        double impuesto = 0;

        if (dia.equals("domingo")) {
            impuesto = costo * 0.03;
        } else {
            if (turno.equals("mañana")) {
                impuesto = costo * 0.15;
            } else if (turno.equals("tarde")) {
                impuesto = costo * 0.10;
            }
        }

        double total = costo + impuesto;

        JOptionPane.showMessageDialog(null,"Costo base: " + costo + " €\n" +"Impuesto: " + impuesto + " €\n" +"Total a pagar: " + total + " €");
    }
}
