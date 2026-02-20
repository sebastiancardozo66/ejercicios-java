package ejercicio26;

import javax.swing.JOptionPane;
public class DiaSemana {
//Realiza un programa que pida el dí­a de la semana (del 1 al 7) y escriba el dí­a correspondiente. Si introducimos otro número nos da un error.
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 7:"));

        String nombreDia;

        switch (dia) {
            case 1:nombreDia = "Lunes";
                break;
            case 2:nombreDia = "Martes";
                break;
            case 3:nombreDia = "Miércoles";
                break;
            case 4:nombreDia = "Jueves";
                break;
            case 5:nombreDia = "Viernes";
                break;
            case 6:nombreDia = "Sábado";
                break;
            case 7:nombreDia = "Domingo";
                break;
            default:nombreDia = "Error: número fuera de rango";
        }

        JOptionPane.showMessageDialog(null, nombreDia);
    }
}
