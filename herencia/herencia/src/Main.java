public class Main {
    public static void main(String[] args) {

        //Piloto raul = new Piloto();
        //raul.setiCantidadCopasGanadas(30);
        //System.out.println("Cantidad de Copas: " + raul.getiCantidadCopasGanadas());


       // Cliente c1 = new Cliente();
       // c1.setsNombre("Raul");
       // c1.setDni("0202020");
      //  System.out.println("Nombre de Cliente: " + c1.getsNombre());
       // c1.conducir();


        Trabajador t1 = new Trabajador();
        t1.setDni("11919292");
        t1.conducir();

        Piloto sCh = new Piloto();
        sCh.conducir();
    }
}