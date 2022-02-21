import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("Introduce el precio sin iva");
        Double precio = c.nextDouble();
        System.out.println("El precio con IVA es: "+ calculaIVA(precio,21));

    }


    public static double calculaIVA(Double precioSinIVA, int porcentajeIVA){

        return ((precioSinIVA * porcentajeIVA)/100)+precioSinIVA;

    }
}
