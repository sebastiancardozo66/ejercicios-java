package ejercicio23;

import javax.swing.JOptionPane;
public class vinicultores {
//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:

//Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
//Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
//Realice un algoritmo para determinar la ganancia obtenida.
    public static void main(String[] args) {

        double precioInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio inicial por kilo:"));

        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de uva (A o B):").toUpperCase();

        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño (1 o 2):"));

        double kilos = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la cantidad de kilos vendidos:"));

        double precioFinal = precioInicial;

        if (tipo.equals("A")) {
            if (tamano == 1) {
                precioFinal += 0.20;
            } else if (tamano == 2) {
                precioFinal += 0.30;
            } else {
                JOptionPane.showMessageDialog(null, "Tamaño inválido");
                return;
            }
        } 
        else if (tipo.equals("B")) {
            if (tamano == 1) {
                precioFinal -= 0.30;
            } else if (tamano == 2) {
                precioFinal -= 0.50;
            } else {
                JOptionPane.showMessageDialog(null, "Tamaño inválido");
                return;
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Tipo inválido");
            return;
        }

        double ganancia = precioFinal * kilos;

        JOptionPane.showMessageDialog(null,"Precio final por kilo: $" + precioFinal +"\nGanancia total: $" + ganancia);
    }
}
