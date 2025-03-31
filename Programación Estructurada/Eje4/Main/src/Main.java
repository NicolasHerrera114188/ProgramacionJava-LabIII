import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* ver video de mapa de java: https://www.youtube.com/watch?v=jT0gnObfFls
           para tener dos valores  */
/* otra idea es con arrayList video: https://www.youtube.com/watch?v=D0VH50zFVIA*/
public class Main {
    public static void main(String[] args) {
        /*4. Ingresar nombre y altura de dos personas, informar el nombre de la más alta.*/
        String persona1,persona2;
        double alturaPersona1, alturaPersona2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("     Datos de la persona   ");
        System.out.println("-------------------------------");
        System.out.println("Nombre Primera persona:");
        persona1=scanner.next();
        System.out.println("Altura:");
        alturaPersona1=scanner.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("Nombre Segunda persona:");
        persona2=scanner.next();
        System.out.println("Altura:");
        alturaPersona2=scanner.nextDouble();
        if(alturaPersona1>alturaPersona2)
            System.out.println(persona1+" es más alto");
        if(alturaPersona2>alturaPersona1)
            System.out.println(persona2+" es más alto");
        if (alturaPersona1==alturaPersona2)
            System.out.println("son del mismo tamaño");
    }
}