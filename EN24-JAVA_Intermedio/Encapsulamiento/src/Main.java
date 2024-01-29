public class Main {

    public static void main(String[] args) {
         boolean bAdminLogeado = true;
        Perro mascota = new Perro("Rambo", "bull");

        //mascota.sNombre = "Rambo";
        //System.out.println(mascota.sNombre);

        DNI dni = new DNI("100020020");


        mascota.setNombre("Rambo");
        mascota.setEdad(5);
        mascota.setEdad(1);
        System.out.println(mascota.getNombre() + mascota.getEdad());
    }
}