public class Main {
    public static void main(String[] args) {
//Revisado:
// Reescribir un atributo
//Rescribir un metodo


        Gato felix = new Gato();
        //felix.nombre = "Felix Torres";
        felix.jugar();
        //felix.setNombre("Felix");
        //System.out.println("Gato: " + felix.nombre);
        System.out.println("Altura de Salto: " + felix.getdAlturaSaltoMetros());
        felix.cazar();

        System.out.println("---------------------- ");
        Leon raul = new Leon();
        //raul.nombre = "RAUL SANTILLAN";
        //System.out.println("Nombre: " + raul.nombre);
        raul.setNombre("RAUL SANTILLAN");
        System.out.println(raul.getNombre());
        System.out.println("Altura de Salto: " + raul.getdAlturaSaltoMetros());
        raul.cazarPresaDobleTam();
        raul.cazar();

    }
}