public class Main {
    public static void main(String[] args) {

       //Declaración
       //Perro rocky;


       //Instanciar o "crear el objeto"
       //rocky = new Perro("Rocky");
/*
       Pequines peq = new Pequines("susy");
       peq.comer("crocretas");
        peq.mostrarRaza();
       peq.asigarRaza("Pequines00000");
       peq.mostrarRaza();
*/
        Doberman dob = new Doberman();
        dob.despertar();
        dob.ladrar();
        dob.asigarRaza("Doberman");
        dob.mostrarRaza();



    }
}