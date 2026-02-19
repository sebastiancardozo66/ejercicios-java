package ejercicio10;

import javax.swing.JOptionPane;
public class calificacion {
//Un alumno desea saber cual será su calificación final en la materia de Estructura de Datos. Dicha calificación se compone de los siguientes porcentajes:
// -55% del promedio de sus tres calificaciones parciales.
// -30% de la calificación del examen final.
// -15% de la calificación de un trabajo final.
    public static void main(String[] args) {

        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota parcial:"));

        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota parcial:"));

        double p3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota parcial:"));

        double examenFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final:"));

        double trabajoFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del trabajo final:"));

        double promedio = (p1 + p2 + p3) / 3;

        double notaFinal = (promedio * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        JOptionPane.showMessageDialog(null,"Promedio de parciales: " + promedio +"\nCalificación final: " + notaFinal);
    }
}
