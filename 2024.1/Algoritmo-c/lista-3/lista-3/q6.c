//6) Escreva um algoritmo que determine se um valor V encontra-se em um arranjo de n elementos. Escreva a equação de tempo de execução do seu algoritmo.

#include<stdio.h>

int checarValor(int vetor[], int tamanho, int elemento){
    for (int i = 0; i < tamanho; i++){             // 2 (inicia i e 1 teste) 
        if(vetor[i] == elemento){                  // 2(n) acesso ao vetor e compara
            return 1;                              // 1 returna se encontrado
        }
    }                                              // 1 incremento de i
    return 0;                                      // 1 retona se encontrado
}                                                  // i executa n vezes pior caso 

int main(){
    int vetor[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int tamanho = sizeof(vetor)/sizeof(vetor[0]);
    int elemento = 14;

    printf(checarValor(vetor, tamanho, elemento) == 1 ? "Tem o elemento\n" : "Não tem o elemento\n");

    return 0;
}

// f(x) = O(n)