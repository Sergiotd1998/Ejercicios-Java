import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {



        //String textoIngresado = cmd.nextLine();
        //System.out.println("Texto: " + textoIngresado);

        boolean bRepetirSolicitud = false;
        int contador = 0;

        do {
            println("Hola!! Ingresa un día de semanana entre 1 y 7. Empezando por Lunes");
            contador++;

            int valor = getDiaSeleccionado();
            String msg = getMensajeDiaSeleccionado(valor);

            println(msg);
            println("valor: " + valor);
            if(valor <=0 && contador <3){
                bRepetirSolicitud = true;
            }else{
                bRepetirSolicitud = false;
            }
        }while(bRepetirSolicitud);


        //if(valorIngresado == 1){
        //    println("El dia el elegido es Lunes");
        //}



    }

    public static int getDiaSeleccionado(){
        int valorIngresado;
        Scanner cmd = new Scanner(System.in);
        try{
            valorIngresado = cmd.nextInt();
        }catch (Exception e){
            return -1;
        }

        if(valorIngresado<1 || valorIngresado > 7){
            return 0;
        }
        return valorIngresado;
    }
    public static String getMensajeDiaSeleccionado(int valorIngresado){
        String sBase = "El dia el elegido es ";
        switch (valorIngresado){
            case 1:
                return sBase + "Lunes";
            case 2:
                return sBase + "Martes";
            case 3:
                return sBase + "Miercoles";
            default:
                return "El dia seleccionado fue incorrecto";
        }
    }
}