//7. Escreva um algoritmo que encontre o menor elemento de um arranjo A com n elementos. Encontre a equação do tempo de execução do algoritmo.

#include<stdio.h>

int checaMenor(int vetor[], int tamanho){
    int menor = vetor[0];

    for (int i = 1; i < tamanho; i++){ // começa de 1
        if(vetor[i] < menor){
            menor = vetor[i];
        }
    }
    return menor;
}

int main(){
    int vetor[5] = {53, 2, 43, 12, 53};
    int tamanho = sizeof(vetor) / sizeof(vetor[0]);
    int result = checaMenor(vetor, tamanho);

    printf("%d\n", result);

    return 0;
}
