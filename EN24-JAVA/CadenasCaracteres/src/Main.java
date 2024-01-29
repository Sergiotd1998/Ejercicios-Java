public class Main {
    public static void main(String[] args) {
        //length, indexOf, substring, equals

        String cadena = "Hola a Todos. Como estan?";
        String cad1 = "", cad2 = "";

        int pos;
        pos = cadena.indexOf(".");
        cad1 = cadena.substring(0,pos);

        cad2 = cadena.substring(pos+1).trim();

        System.out.println(cad1); //Hola a Todos
        System.out.println(cad2); //Como estan?


    }
}