#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int bubblesort(int lista[], int n){
    int aux = 0;

    for (int i = 0; i < n - 1 ; i++){
        if(lista[i] > lista[i+1]){
            aux = lista[i];
            lista[i] = lista[i+1];
            lista[i+1] = aux;
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

    bubblesort(array, tamanho);

    fim = clock();

    tempo = ((double) (fim - comeco)) * 1000 / CLOCKS_PER_SEC;

    printf("Tempo de execução: %f milissegundos\n", tempo);
    
    free(array);

    return 0;
}