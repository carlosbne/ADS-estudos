#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void troca(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int particao(int lista[], int ladoE, int ladoD) {
    int pivo = lista[ladoD];
    int i = ladoE - 1;

    for (int j = ladoE; j < ladoD; j++) {
        if (lista[j] < pivo) {
            i++;
            troca(&lista[i], &lista[j]);
        }
    }
    troca(&lista[i + 1], &lista[ladoD]);
    return (i + 1);
}

void quicksort(int lista[], int ladoE, int ladoD) {
    if (ladoE < ladoD) {
        int p = particao(lista, ladoE, ladoD);

        quicksort(lista, ladoE, p - 1);
        quicksort(lista, p + 1, ladoD);
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

    quicksort(array, 0, tamanho -1);

    fim = clock();

    tempo = ((double) (fim - comeco)) * 1000 / CLOCKS_PER_SEC;

    printf("Tempo de execução: %f milissegundos\n", tempo);
    
    free(array);

    return 0;
}