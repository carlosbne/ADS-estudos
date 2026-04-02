//2) Escreva um algoritmo que receba valores em um vetor e imprima “ORDENADO” se o vetor estiver em ordem crescente. Qual e função de custo de pior caso e sua ordem de ~ complexidade O?

//No pior caso, o loop percorre todos os elementos do array até encontrar um fora de ordem, então é O(n).

#include <stdio.h>

int verificaOrdenado(int vetor[], int tamanho){
    for (int i = 1; i < tamanho; i++){  
        if (vetor[i - 1] > vetor[i]){
            return 0;
        }
    }
    return 1;
}

int main(){
    int vetor[5] = {1, 2, 3, 4, 5};
    int tamanho = sizeof(vetor)/sizeof(vetor[0]);

    if(verificaOrdenado(vetor, tamanho)){
        printf("ORDENADO\n");
    }
}