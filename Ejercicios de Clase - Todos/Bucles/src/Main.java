public class Main {
    public static void main(String[] args) {
        int contador = 100;

        System.out.println("Antes");

       //while(contador < 10){
       //    contador = contador + 1;   //===>    contador++;
       //   System.out.println("Hello world! - " + contador);
        //}

        do{
            contador++;
            System.out.println("Hello world! - " + contador);
        }while(contador < 10);

       System.out.println("Continuación");



    }
}