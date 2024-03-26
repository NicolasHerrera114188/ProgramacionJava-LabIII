import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* 1. Declarar dos variables enteras y cargar sus valores por teclado. Informar su
              suma, diferencia, producto y cociente. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor entero: ");
        int valor1= scan.nextInt();
        System.out.println("Ingrese otro valor entero: ");
        int valor2= scan.nextInt();
        int resSuma=valor1+valor2;
        int resDiv=valor1/valor2;
        int resMult=valor1*valor2;
        int resCoci=valor1%valor2;
        System.out.println("Suma: "+valor1+" + "+valor2+"= "+resSuma);
        System.out.println("Diferencia: "+valor1+" / "+valor2+"= "+resDiv);
        System.out.println("Producto: "+valor1+" X "+valor2+"= "+resMult);
        System.out.println("Cociente: "+valor1+" y "+valor2+"= "+resCoci);
    }
}