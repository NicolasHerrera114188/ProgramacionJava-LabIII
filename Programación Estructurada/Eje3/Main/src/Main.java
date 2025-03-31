import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* 3. Hacer un programa que ingrese los datos de una factura en la cual haya tres
           artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
           Finalmente imprimir el total de la factura*/

        Scanner scanner=new Scanner(System.in);
        double precio, cantidad, total;
        total=0;
        System.out.println("------------Datos de una Factura---------");
        for (int i=0;i<3;i++)
        {
            System.out.println("articulo: "+(i+1));
            System.out.println("precio:");
            precio=scanner.nextDouble();
            System.out.println("Cantidad:");
            cantidad=scanner.nextInt();
            total+=precio*cantidad;
        }
        System.out.println("Total=     "+total);
    }
}