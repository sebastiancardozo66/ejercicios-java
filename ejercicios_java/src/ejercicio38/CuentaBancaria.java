package ejercicio38;
import java.util.Scanner;
public class CuentaBancaria {
     
 private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Consignación exitosa. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    // Metodo principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria("00123456", "Sebastian Cardozo", 500000);

        System.out.println("Cuenta creada correctamente.\n");

        cuenta.consultarSaldo();

        System.out.print("\nIngrese valor a consignar: ");
        double consignar = sc.nextDouble();
        cuenta.consignar(consignar);

        System.out.print("\nIngrese valor a retirar: ");
        double retirar = sc.nextDouble();
        cuenta.retirar(retirar);

        cuenta.consultarSaldo();

        sc.close();
    }
}
