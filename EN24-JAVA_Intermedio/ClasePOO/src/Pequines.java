public class Pequines extends Perro {
    public String sRaza = "sin definirXX";

    public Pequines(String nombre){
        super(nombre);
    }

    public void dormir(){
        super.dormir();
        System.out.println("El perro está Durmiendo ...");
    }
    public void asigarRaza(String raza){
        this.sRaza = raza;
    }
    public void mostrarRaza(){
        System.out.println("La raza es (1): " + this.sRaza);
    }
}
