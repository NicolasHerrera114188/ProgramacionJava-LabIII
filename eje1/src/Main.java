import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        persona[] persona=new persona[3];
        Scanner scanner=new Scanner(System.in);
        //boolean res=false;
        System.out.printf("-------  Bienvenido al Menú --------");
        System.out.println("     Ingrese Los datos de la Persona");
        for (int i=0;i< persona.length;i++) {
            System.out.println("Nombre: ");
            String nombre=scanner.nextLine();
            System.out.println("Apellido: ");
            String apellido=scanner.nextLine();
            System.out.println("Edad: ");
            int edad=scanner.nextInt();
            persona[i]=new persona(nombre,apellido,edad);
        }

        System.out.println("--- Registro Persona ---");
        //System.out.println(persona.ToString());
        int ac=0;
        for (int i=0;i<persona.length;i++){
            ac+= persona[i].getEdad();
        }
        float prom=(float) ac/ persona.length;
        System.out.println("promedio de las edades persona: "+prom);
    }
}