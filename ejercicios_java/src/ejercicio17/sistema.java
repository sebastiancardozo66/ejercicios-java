package ejercicio17;

import javax.swing.JOptionPane;
public class Sistema {
//Escribe un programa que pida un nombre de usuario y una contraseña y 
// si se ha introducido correctamente indicar "Has entrado al sistema", sino se da un mensaje de error.
     public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog("Ingrese el usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");

        if (usuario.equals("admin") && contrasena.equals("1234")) {
            JOptionPane.showMessageDialog(null,"Has entrado al sistema");
        } else {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
        }
    }
}
