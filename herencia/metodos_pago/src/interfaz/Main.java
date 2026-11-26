package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        MetodoPago pago1 = new Tarjeta("Ana", 1000, "****1234");
        MetodoPago pago2 = new Transferencia("Luis", 2000, "Banco X");
        MetodoPago pago3 = new BilleteraDigital("Maria", 500, "PayPal");
        MetodoPago pago4 = new PagoContraEntrega("Pedro", 300, "Quito");
        Compra compra1 = new Compra(100, pago1);
        Compra compra2 = new Compra(100, pago2);
        Compra compra3 = new Compra(100, pago3);
        Compra compra4 = new Compra(100, pago4);
        System.out.println(compra1.mostrarInformacion());
        System.out.println("Total con comision: " + compra1.calcularTotalConComision());
        System.out.println(compra2.mostrarInformacion());
        System.out.println("Total con comision: " + compra2.calcularTotalConComision());
        System.out.println(compra3.mostrarInformacion());
        System.out.println("Total con comision: " + compra3.calcularTotalConComision());
        System.out.println(compra4.mostrarInformacion());
        System.out.println("Total con comision: " + compra4.calcularTotalConComision());
    }
}
