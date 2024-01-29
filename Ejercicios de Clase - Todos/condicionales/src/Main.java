public class Main {
    public static void main(String[] args) {
        //Ingreso a una discoteca > 18 años
        //Solo las señoritas > 18 pueden entra, y los chicos mayores o igual a 20.

        int edadAsistente  = 20;;
        boolean bMasculino = true;

        if(bMasculino){     //bMasculino == true        bMasculino == false      !bMasculino
            System.out.println("HOMBRES");
            if(edadAsistente >= 20){
                System.out.println("PERMITIDO1");
            }else{
                System.out.println("DENEGADO1");
            }
        }else{
            System.out.println("MUJERES");
            if(edadAsistente > 18){
                System.out.println("PERMITIDO2");
            }else{
                System.out.println("DENEGADO2");
            }
        }


        System.out.println("CONTINUACION");
    }
}