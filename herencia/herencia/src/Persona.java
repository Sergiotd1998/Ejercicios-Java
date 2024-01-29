public class Persona {
    private String sNombre;
    private int iEdad;
    private String dni;

    public Persona() {
        System.out.println("Constructor de Persona2");
    }

   // public Persona(String sNombre){
   //     System.out.println("Constructor de Persona3");
   //     this.sNombre = sNombre;
  //  }

    public void caminar(){
        System.out.println("Camiando ...");
    }

    public void correr(){
        System.out.println("Corriendo ...");
    }

    public void conducir(){
        System.out.println("Manejando normal");
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
