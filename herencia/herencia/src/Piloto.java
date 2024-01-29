public class Piloto extends Persona{
    private int iCantidadCopasGanadas = 20;

    public Piloto(){
        iCantidadCopasGanadas = 10;
        System.out.println("Constructor de Piloto");
    }
    public void conducir(){
        //super.conducir();
        System.out.println("Manejando en modo extremo");

    }

    public int getiCantidadCopasGanadas() {
        return iCantidadCopasGanadas;
    }

    public void setiCantidadCopasGanadas(int iCantidadCopasGanadas) {
        this.iCantidadCopasGanadas = iCantidadCopasGanadas;
    }
}
