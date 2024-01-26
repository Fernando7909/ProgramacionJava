public class Buscar {
    public static void main(String[] args){

        float[] ArrayNotas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
        boolean encontrado = false;

        for(int i = 0; i < ArrayNotas.length; i++){
            if(ArrayNotas[i] < 5){
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("Alguien ha suspendido");
        }
    }
}