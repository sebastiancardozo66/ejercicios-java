package ejercicio13;

import javax.swing.JOptionPane;
public class Vehiculos {
//Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que está detrás viaja a una velocidad mayor. 
//Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar 
//en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
    public static void main(String[] args) {

        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia entre los vehículos (km):"));

        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad del vehículo más lento (km/h):"));

        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad del vehículo más rápido (km/h):"));

        if (v2 <= v1) {
            JOptionPane.showMessageDialog(null, "La velocidad del segundo vehículo debe ser mayor para que lo alcance.");
        } else {
            double velocidadRelativa = v2 - v1;
            double tiempoHoras = distancia / velocidadRelativa;
            double tiempoMinutos = tiempoHoras * 60;

            JOptionPane.showMessageDialog(null,"El vehículo más rápido alcanzará al otro en: " + tiempoMinutos + " minutos.");
        }
    }
}
