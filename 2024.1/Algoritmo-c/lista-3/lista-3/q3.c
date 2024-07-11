//Escreva um algoritmo que determine se um valor V encontra-se em um arranjo de n elementos. Escreva a equação de tempo de execução do seu algoritmo.

#include<stdio.h>

int checarValor(int vetor[], int tamanho, int elemento){
    for (int i = 0; i < tamanho; i++){
        if(vetor[i] == elemento){
            return 1;
        }
    }
    return 0;
}

int main(){
    int vetor[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int tamanho = sizeof(vetor)/sizeof(vetor[0]);
    int elemento = 14;

    printf(checarValor(vetor, tamanho, elemento) == 1 ? "Tem o elemento\n" : "Não tem o elemento\n");

    return 0;
}
