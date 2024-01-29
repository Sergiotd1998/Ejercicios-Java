public class Main {
    public static void main(String[] args) {

        String frase = "Hola que tal como estas?";
        String cad1 = "", cad2="";
        int pos;

        cad2 = frase;

        //########################################
        pos = cad2.indexOf(" ");
        do{
            cad1 = cad2.substring(0,pos);
            cad2 = cad2.substring(pos+1);

            System.out.println(cad1);
            //System.out.println(cad2);
            //System.out.println();
            pos = cad2.indexOf(" ");
        }while(pos>0);

        System.out.println(cad2);

        //Hacer un contador de palabras
        //Invertir las palabras de un texto.
        //frag("hola|valor2|valor3","|",2)   => valor2
        //frag("hola|valor2|valor3","|",1)   => hola
        //frag("hola|valor2|valor3","|",3)   => valor3
        //frag("hola|valor2|valor3","|",4)   => ""

        //10100110|01010   |1292929299|101010101010|










    }
}