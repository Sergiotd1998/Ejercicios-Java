public class Gato {
    //Atributos
    String sRaza = "domestico";
    int iDimensiones;
    int iEdad;
    double dPeso;
    String sColorPelo;

    public Gato(String sRaza){ //Método llamado Constructor, que ejecuta automaticamente cuando se INSTANCIA
        //Inicializar valores
        System.out.println("Instanciando - 1: " + this.sRaza +  "- " + sRaza);
        this.sRaza = sRaza;
        System.out.println("Instanciando - 2: " + this.sRaza);
    }

    //Metodos
    public void saltar(){

    }
    public void jugar(){
        String sRaza = "OTro";
        System.out.println("Jugando..." + this.sRaza + " - " +  sRaza);
    }
    public void arañar(){

    }
    public void maullar(){

    }
    public void dormir(){

    }
    public void comer(){

    }
    public void cazar(){

    }

}
