package ejercicio24;

import javax.swing.JOptionPane;
public class ViajeEstudios {
//El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
// compañía de viajes por el servicio. La forma de cobrar es la siguiente:

//si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
//de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros,
//y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos:"));

        double costoAlumno;
        double total;

        if (n >= 100) {
            costoAlumno = 65;
            total = n * costoAlumno;
        } else if (n >= 50) {
            costoAlumno = 70;
            total = n * costoAlumno;
        } else if (n >= 30) {
            costoAlumno = 95;
            total = n * costoAlumno;
        } else {
            total = 4000;
            costoAlumno = total / n;
        }
        JOptionPane.showMessageDialog(null,"Pago total a la empresa: " + total + " euros\n" +"Pago por alumno: " + costoAlumno + " euros");
    }
}
