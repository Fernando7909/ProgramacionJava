public class Suspenso {
    public static void main(String[] args){

        double[] array_double = {1,1,3,4,5,6,7,14,9,1,2.3,12};
        double nota_corte = 5;
        boolean aprovado = false;

        System.out.println("Verifica entre las siguentes notas del array quien a suspendido y en que posicion está.");

        for(int i = 0; i < array_double.length; i++){
            if(array_double[i] < nota_corte){
                System.out.println("La nota" + array_double[i] + "de la posicion " + i + " ha suspendido");
                aprovado = true;
            }
            else{
                System.out.println("La nota" + array_double[i] + "de la posicion " + i + " ha aprovado");
            }
        }
    }
}