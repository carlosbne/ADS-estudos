public class InsertionSort {
    public void inserSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int verifica = i;                                         //define primeiro elemento a ser verificado como o incial
            while(verifica > 0 && arr[verifica] < arr[verifica - 1]){ //enquanto verif > 0 E o elemento na posiçao verificada < q posição verif-1
                int temp = arr[verifica];                             //caso seja menor efetua a troca de posição
                arr[verifica] = arr[verifica - 1];
                arr[verifica - 1] = temp;
                verifica -= 1;
            }
        }
    }

    //funcao para imprimir o array
    public void imprimir(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
