public class PilotoAntiguo {
    private String sNombre;
    private int iEdad;
    private int iCantidadCopasGanadas = 20;

    public PilotoAntiguo(){
        iCantidadCopasGanadas = 10;
        System.out.println("Constructor de Piloto");
    }

    public void caminar(){
        System.out.println("Camiando ...");
    }

    public void correr(){
        System.out.println("Corriendo ...");
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

    public int getiCantidadCopasGanadas() {
        return iCantidadCopasGanadas;
    }

    public void setiCantidadCopasGanadas(int iCantidadCopasGanadas) {
        this.iCantidadCopasGanadas = iCantidadCopasGanadas;
    }
}
