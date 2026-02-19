package ejercicio20;

import javax.swing.JOptionPane;
public class tipoTriangulo {
//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. 
// El programa debe determinar que tipo de triángulo es, teniendo en cuenta:

//Si se cumple Pitágoras entonces es triángulo rectángulo
//Si sólo dos lados del triángulo son iguales entonces es isósceles.
//Si los 3 lados son iguales entonces es equilátero.
//Si no se cumple ninguna de las condiciones anteriores, es escaleno.
   public static void main(String[] args) {

        double A = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el lado A:")
        );

        double B = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el lado B:")
        );

        double C = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el lado C:")
        );

        double hip, cat1, cat2;

        // Identificar la hipotenusa (lado mayor)
        if (A >= B && A >= C) {
            hip = A;
            cat1 = B;
            cat2 = C;
        } else if (B >= A && B >= C) {
            hip = B;
            cat1 = A;
            cat2 = C;
        } else {
            hip = C;
            cat1 = A;
            cat2 = B;
        }

        if (A == B && B == C) {
            JOptionPane.showMessageDialog(null,"El triángulo es EQUILÁTERO");
        } 
        else if (Math.pow(hip, 2) == Math.pow(cat1, 2) + Math.pow(cat2, 2)) {
            JOptionPane.showMessageDialog(null,"El triángulo es RECTÁNGULO");
        } 
        else if (A == B || A == C || B == C) {
            JOptionPane.showMessageDialog(null,"El triángulo es ISÓSCELES");
        } 
        else {
            JOptionPane.showMessageDialog(null,"El triángulo es ESCALENO");
        }
    }
}

