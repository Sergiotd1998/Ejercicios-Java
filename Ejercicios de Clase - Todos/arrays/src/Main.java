public class Main {
    public static void main(String[] args) {
        int lista[] = {	9,8,7,5,7,      	9	};
        //System.out.println(lista[6]);

        String nombres[] = {"jose", "maria", "david", "raul"};
        nombres[1] = "Saul";

        for(int i=0; i < nombres.length;i++){
            //System.out.println(nombres[i]);
        }
        for(int i=nombres.length-1; i>=0; i--){
            System.out.println(nombres[i]);
        }

    }
}