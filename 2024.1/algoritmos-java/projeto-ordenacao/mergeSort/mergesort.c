#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void merge(int lista[], int ladoE, int meio, int ladoD) {
    int tamE = meio - ladoE + 1;
    int tamD = ladoD - meio;

    int *ladoEArray = (int*)malloc(tamE * sizeof(int));
    int *ladoDArray = (int*)malloc(tamD * sizeof(int));

    for (int i = 0; i < tamE; i++)
        ladoEArray[i] = lista[ladoE + i];
    for (int j = 0; j < tamD; j++)
        ladoDArray[j] = lista[meio + 1 + j];

    int i = 0;
    int j = 0;
    int k = ladoE;

    while (i < tamE && j < tamD) {
        if (ladoEArray[i] <= ladoDArray[j]) {
            lista[k] = ladoEArray[i];
            i++;
        } else {
            lista[k] = ladoDArray[j];
            j++;
        }
        k++;
    }

    while (i < tamE) {
        lista[k] = ladoEArray[i];
        i++;
        k++;
    }

    while (j < tamD) {
        lista[k] = ladoDArray[j];
        j++;
        k++;
    }

    free(ladoEArray);
    free(ladoDArray);
}

void mergesort(int lista[], int ladoE, int ladoD) {
    if (ladoE < ladoD) {
        int meio = ladoE + (ladoD - ladoE) / 2;

        mergesort(lista, ladoE, meio);
        mergesort(lista, meio + 1, ladoD);

        merge(lista, ladoE, meio, ladoD);
    }
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

    int tamanho = 100000;

    srand(time(NULL));
    int *array = criarArray(tamanho);

    comeco = clock();

    mergesort(array, 0, tamanho -1);

    fim = clock();

    tempo = ((double) (fim - comeco)) * 1000 / CLOCKS_PER_SEC;

    printf("Tempo de execução: %f milissegundos\n", tempo);
    
    free(array);

    return 0;
}