public class MergeSort {
    public void merge(int arr[], int len){ 
        if(len < 2){
            return;
        }

        //define o tamnho e cria duas arrays
        int meio = len/2;
        int[] l1 = new int[meio];
        int[] l2 = new int[len - meio];

        //copia os dados da array principal para as duas temporarias
        for(int i = 0; i < meio; i++){
            l1[i] = arr[i];
        }
        for(int i = meio; i < len; i++){
            l2[i - meio] = arr[i];
        }
        merge(l1, meio);
        merge(l2, len - meio);
    }
}
