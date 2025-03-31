import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* 2. Hacer un programa que ingrese el precio de un artículo a la venta
              y calcule el precio con IVA.*/



        Scanner scanner=new Scanner(System.in);
        double precioArticulo, resIva, porcentajeIva;
        porcentajeIva=1.21;
        System.out.println("---------- Vente de Producto -----------");
        System.out.println("Ingrese el presio del articulo para el calculo del IVA: ");
        precioArticulo=scanner.nextDouble();

        resIva=precioArticulo*porcentajeIva;
        System.out.println("precio del articulo con IVA es: "+resIva);
    }
}