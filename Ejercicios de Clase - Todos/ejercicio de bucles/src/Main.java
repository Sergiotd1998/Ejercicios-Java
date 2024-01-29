
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cmd;
        cmd = new Scanner(System.in); // La variable cmd es una instancia de la clase Scanner: Instanciación
        int numero = 0;
        String nombre= "";
        System.out.println("Ingresa tu numbre");
        nombre = cmd.nextLine();

        System.out.println("Ingresa tu edad");
        numero = cmd.nextInt();

        System.out.println("Hola " + nombre +  ". Tu edad es: " + numero);


        //String nombre;
        //nombre = "Hola";
        //nombre = new String("Hola");
        //System.out.println("Hello world!: " + nombre);
    }
}