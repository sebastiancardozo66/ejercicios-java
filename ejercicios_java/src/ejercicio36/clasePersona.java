package ejercicio36;

public class ClasePersona {
    
    private String nombre;
    private String apellido;
    private String documento;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    // Constructor
    public ClasePersona(String nombre, String apellido, String documento, int anioNacimiento, 
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
        System.out.println("Pais de nacimiento: " + paisNacimiento);
        System.out.println("Genero: " + genero);
        System.out.println("----------------------------");
    }

    // Método principal
    public static void main(String[] args) {

    
        ClasePersona p1 = new ClasePersona("Sebastian", "Cardozo", "12345678", 2004, "Colombia", 'H');
        ClasePersona p2 = new ClasePersona("Laura", "Gómez", "87654321", 2002, "Colombia", 'M');

        
        p1.imprimirDatos();
        p2.imprimirDatos();
    }
}

