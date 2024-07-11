//7) Escreva um algoritmo que encontre o menor elemento de um arranjo A com n elementos. Encontre a equação do tempo de execução do algoritmo.

#include<stdio.h>

int checaMenor(int vetor[], int tamanho){
    int menor = vetor[0];                   // 1

    for (int i = 1; i < tamanho; i++){      // 2 (inicia i e 1 teste)
        if(vetor[i] < menor){               // 2(n - 1) acesso ao vetor e compara
            menor = vetor[i];               // 2 acesso e atribuicao pior caso 2(n - 1)
        }                                   
    }                                       // 1 incremento de i
    return menor;                           // 1 retorna menor
}                                           // i executa n vezes pior caso      

int main(){
    int vetor[5] = {53, 2, 43, 12, 53};
    int tamanho = sizeof(vetor) / sizeof(vetor[0]);
    int result = checaMenor(vetor, tamanho);

    printf("%d\n", result);

    return 0;
}

//R: f(n) = O(n)
