package ejercicio36;

public class clasePersona {
    
    private String nombre;
    private String apellido;
    private String documento;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    // Constructor
    public clasePersona(String nombre, String apellido, String documento, int anioNacimiento, 
                    String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }


    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("----------------------------");
    }

    // Método principal
    public static void main(String[] args) {

    
        clasePersona p1 = new clasePersona("Sebastián", "Cardozo", "12345678", 2004, "Colombia", 'H');
        clasePersona p2 = new clasePersona("Laura", "Gómez", "87654321", 2002, "Colombia", 'M');

        
        p1.imprimirDatos();
        p2.imprimirDatos();
    }
}

