import lombok.Getter;
import lombok.Setter;

public class Perro {
    @Setter @Getter private boolean bAdminLogeado = true;
    @Setter @Getter private String sNombre;
    @Setter @Getter private String lugarNAacimiento;
    @Setter @Getter private double peso;
    @Setter @Getter private String raza;
    @Setter @Getter private String color;
    @Setter @Getter private String tipoPelaje;

    @Setter @Getter
    private int edad;


    @Setter @Getter private String colorOjos;



    public Perro(String nombre, String raza){
       this.sNombre = nombre;
       this.raza = raza;
    }


    public void setNombre(String nombre){
        if(bAdminLogeado ==true){
            this.sNombre = nombre;
        }else{
            System.out.println("Restringido - Cambio de nombre");
        }

    }

    public String getNombre(){
        return this.sNombre;
    }
}
