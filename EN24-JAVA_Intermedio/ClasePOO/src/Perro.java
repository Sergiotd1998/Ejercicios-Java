public class Perro {
    public String sNombre;
    public String sRaza = "sin definir";
    public double dPeso;
    public String sColor;
    public int iEdad;
    public int nRoPatas = 4;

    //CONSTRUCTOR:
    public Perro(){
        //USado para inicializar variables
        System.out.println("Creando el Perro");
    }
    public Perro(String sNombre){
        this.sNombre = sNombre;
        System.out.println("Creando el Perro llamado " + sNombre);
    }
    public void asigarRaza(String raza){
        this.sRaza = raza;
    }
    public void mostrarRaza(){
        System.out.println("La raza es (2): " + this.sRaza);
    }
    public void ladrar(){
        System.out.println("Ladrando ...");
    }

    public void comer(String alimento){
        System.out.println(sNombre + " está comiendo unas ricas " + alimento);
    }

    public void dormir(){
        System.out.println("Durmiendo ...");
    }

    public void despertar(){
        System.out.println("Despertando ...");
    }

}
