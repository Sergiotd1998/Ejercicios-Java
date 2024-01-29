public class Main {
    public static void main(String[] args) {



        //Control de Acceso a Una Discoteca

        int iGenero = 1; //hombres, 2: Mujeres
        int edadCumplida = 19;

        boolean acceso = evaluarAcceso(iGenero, edadCumplida);

        validarAccesoDiscota();

        /*
        if(acceso){
            System.out.println("Bienvenido!!!!");
        }else{
            System.out.println("No puede ingresar, no cumple los requisitos solicitados");
        }
*/

    }

    public static void validarAccesoDiscota(){
        //Tutorial de Junit
       assertion(evaluarAcceso(1,18), false);
       assertion(evaluarAcceso(2,18), false);
       assertion(evaluarAcceso(2,20), false);
       assertion(evaluarAcceso(2,21), true);

    }

    public static void assertion(boolean resultado, boolean resultadoEsperado){
        if(!(resultado == resultadoEsperado)){
            System.out.println("NO PASA LA PRUEBA");
        }
    }


    public static boolean evaluarAcceso(int genero, int edad){
        //Marek ...
        //Registrar una funcion que evalue el acceso o no a la Discoteca.
        //Evaluar:
        //Hombres:  tienen mayores a 18 años
        //Mujeres: tenen que ser mayores 20 años


        if(genero == 1 && edad > 18){
            return true;
        }else if(genero == 2 && edad >= 20){
            return true;
        }else{
            return false;
        }
/*
        if(genero == 1){
            if(edad > 18){
                return true;
            }else{
                return false;
            }

        }else if(genero == 2){
            if(edad > 20){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
*/
    }
}