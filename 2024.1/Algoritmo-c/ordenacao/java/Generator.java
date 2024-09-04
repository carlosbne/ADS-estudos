import java.util.Random;

class Generator{

    static void imprimir(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int tamanho = 10;
        int[] arr = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            Random rand = new Random();
            int number = rand.nextInt(100);
            arr[i] = number;
        } 
        imprimir(arr);
    }
}