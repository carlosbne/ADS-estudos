#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int insertionsort(int lista[], int n){

    for (int i = 1; i < n; i++) {
        int aux = lista[i];
        int j = i - 1;
        
        while (j >= 0 && lista[j] > aux) {
            lista[j + 1] = lista[j];
            j--;
        }
        lista[j + 1] = aux;
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

    insertionsort(array, tamanho);

    fim = clock();

    tempo = ((double) (fim - comeco)) * 1000 / CLOCKS_PER_SEC;

    printf("Tempo de execução: %f milissegundos\n", tempo);
    
    free(array);

    return 0;
}