import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declaramos un objeto del tipo Gato. Tambien se está creando una instancia del objeto Gato-
        Gato g;

        System.out.println(".....");

        g = new Gato("Cocker");

        g.jugar();

        Scanner cmd = new Scanner(System.in);


    }
}