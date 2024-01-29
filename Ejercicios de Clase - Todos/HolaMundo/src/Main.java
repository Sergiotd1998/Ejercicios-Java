public class Main {
    static int iEdad  = 20;

    public static void main(String[] args) {
        //Punto de Partida: método main
        saludar(50);
        int iEdad  = 30;
        System.out.println(iEdad);
        saludar(78);
    }

    public static void saludar(int iEdad) {
        System.out.println("Hola: " + iEdad);
    }
}