public class SelectionSort {
    //funcao selectionsort 
    public void sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){ 
            int menor = i;                              //define o menor como primeiro elemento
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[menor]){                //procura menor elemento a partir do i+1 até o último elemento
                    menor = j;                          
                }
            }
            if(menor != i){                             //se houver, troca o menor elemento encontrado com a posiçao inicial
                int temp = arr[i];
                arr[i] = arr[menor];
                arr[menor] = temp; 
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
