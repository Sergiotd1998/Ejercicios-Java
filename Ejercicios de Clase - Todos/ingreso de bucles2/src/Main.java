import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);

        int CLAVE_SISTEMA = 123456;
        int claveIngresada= 0;
        boolean bAccesoCorrecto = false;
        int numeroIntentos = 4; //Modificar el codigo, agregando que se puedan tener N intentos


        while(bAccesoCorrecto == false){

            //CODIGO A REPETIR
            System.out.println("Ingresa la clave del Sistema");
            claveIngresada = cmd.nextInt();

            if(claveIngresada == CLAVE_SISTEMA){
                bAccesoCorrecto = true;
            }else{
                bAccesoCorrecto = false;
            }
            //break; //Romper el bucle
        }


        if(bAccesoCorrecto){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Acceso Denegado"); //Nunca se ejecutará....
        }

    }
}