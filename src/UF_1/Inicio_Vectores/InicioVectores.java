public class InicioVectores{
    public static void main(String[] args){

        int[] Array_Valores_Dobles = new int[51];

        for(int i = 1; i < Array_Valores_Dobles.length; i++){                        
            Array_Valores_Dobles[i] = Array_Valores_Dobles[i - 1] + 2;                
                
        }
        for(int i = 0; i < Array_Valores_Dobles.length; i++){               
            System.out.println("Posicion: " + i + " Valor del Array " + Array_Valores_Dobles[i]);
        }
    }
}