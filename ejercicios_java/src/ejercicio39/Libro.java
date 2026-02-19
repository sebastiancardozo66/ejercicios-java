package ejercicio39;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("---------------------------");
    }

    public void modificarAnio(int nuevoAnio) {
        if (nuevoAnio > 0) {
            anioPublicacion = nuevoAnio;
            System.out.println("Año de publicación actualizado correctamente.");
        } else {
            System.out.println("Año invalido.");
        }
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.modificarAnio(1970);

        libro1.mostrarInformacion();
    }
}
