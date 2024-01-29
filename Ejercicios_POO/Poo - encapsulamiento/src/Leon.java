public class Leon extends Felino{

    //Modificar //Agregar

    public Leon(){
        super(8);
    }

    public void cazarPresaDobleTam(){
        System.out.println("CAzando una presa que me dobla de tamaño");
    }
    public double getdDañoPrimeraMordina() {
        return 5;
        //return dDañoPrimeraMordina;
    }
    public void cazar(){
        System.out.println("Cazando por el costado con daño " + super.getdDañoPrimeraMordina());
    }


}
