#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int selectionsort(int lista[], int n){

    int min = 0;
    int aux = 0;

    for(int i = 0; i < n; i++){
        min = i;
        for(int j = i; j < n; j++){
            if(lista[j] < lista[min]){
                min = j;
            }
        }
        if(min != i){           // tem troca
            aux = lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }
    }
    
    return 0;
}

int* criarArray(int tamanho) {
    int *array = (int*)malloc(tamanho * sizeof(int));

    for (int i = 0; i < tamanho; i++) {
        array[i] = i;
    }

    for (int i = tamanho - 1; i > 0; i--) {
        int j = rand() % (i + 1);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    return array;
}

int main(){
    clock_t comeco, fim;
    double tempo;

    int tamanho = 10;

    srand(time(NULL));
    int *array = criarArray(tamanho);

    comeco = clock();

    selectionsort(array, tamanho);

    fim = clock();

    tempo = ((double) (fim - comeco)) * 1000 / CLOCKS_PER_SEC;

    printf("Tempo de execução: %f milissegundos\n", tempo);
    
    free(array);

    return 0;
}