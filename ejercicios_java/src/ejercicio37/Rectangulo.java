package ejercicio37;

public class Rectangulo {
    
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    
    public double calcularArea() {
        return ancho * alto;
    }

    
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Método principal
    public static void main(String[] args) {

        
        Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(10, 4);

        
        System.out.println("Rectangulo 1:");
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());

        System.out.println("\nRectangulo 2:");
        System.out.println("Area: " + r2.calcularArea());
        System.out.println("Perimetro: " + r2.calcularPerimetro());
    }
}
