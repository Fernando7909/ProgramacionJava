public class NotaMaxima {
    public static void main(String[] args){

        double[] array_double = {1,10,3,4,5,6,14,8,9,10,2.3,12};
        double Nota_Maxima = array_double[0];
        double posicion = 0;


        for(int i = 0; i < array_double.length; i++){
            if(array_double[i] > Nota_Maxima){
                Nota_Maxima = array_double[i];
                posicion = i;
            }
        }
        System.out.println("La nota mas alta de este Array es: " + Nota_Maxima + " y su posicion en el array es: " + posicion);
    }
}
