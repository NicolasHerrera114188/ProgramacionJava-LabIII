import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* 1. Declarar dos variables enteras y cargar sus valores por teclado. Informar su
              suma, diferencia, producto y cociente. */
       Scanner scanner = new Scanner(System.in);
       int valor1, valor2, cociente;
       double suma, diferencia, producto;
       System.out.println("-----------------Ingrese dos valores enteros----------------");
       System.out.println("valor 1: ");
       valor1= scanner.nextInt();
       System.out.println("valor 2");
       valor2=scanner.nextInt();

       if(valor2==0)
       {
          System.out.println("!ERROR NO SE PUEDE HACER DIFERENCIA DE CERO VUELVA DIGITAR VALOR 2:");
          valor2=scanner.nextInt();
       }
       suma= valor1+valor2;
       diferencia=valor1/valor2;
       producto=valor1*valor2;
       cociente=valor1%valor2;

       System.out.println("resultado de la operaciones:");
       System.out.println("Suma: "+suma);
       System.out.println("Diferencia: "+diferencia);
       System.out.println("Producto: "+producto);
       System.out.println("Cociente entre los dos numero: "+cociente);
    }
}