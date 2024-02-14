public class Nota10 {
    public static void main(String[] args){

        double[] array_double = {1,1,3,4,5,6,7,14,9,1,2.3,12};
        double nota = 10;
        boolean hay10 = false;


        for(int i = 0; i < array_double.length; i++){
            if(array_double[i] == nota){
                System.out.println("El 10 esta en la posicion: " + i);
                hay10 = true;
            }
        }
        if(!hay10){
            System.out.println("No hay ningun numero 10 en el Array.");    
        }
    }
} 