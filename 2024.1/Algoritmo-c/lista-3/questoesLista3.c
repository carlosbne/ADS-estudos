/*1 ) Faça um gráfico das funções f(x)=5x, g(x)=log2x, h(x)=x log2x, w(x)=x^2, z(x)=x^3
e t(x)=2^x, para os eixos x e y e considerando os intervalos x >= 1 e y >= 0. Use o site desmos.com para auxiliar nesta tarefa e responda às seguintes perguntas: */

/*f) Qual função apresenta a maior taxa de
crescimento? R: t(x)=2^x */


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

/*4) Calcule a complexidade, no pior caso, do fragmento de codigo abaixo:
    

int i , j , k , s ;
for ( i =0; i < N−1; i ++){             //  i executa N - 1 vezes
    for ( j= i +1; j < N; j ++){        //  j executa N - 1 i vezes / 2
        for ( k=1; k < j ; k++){        //  k executa N - 1 j vezes / 2
            s = 1 ;                     //  resultado pior dos casos O(n^3)
        }
    }

}

*/


/*
5. Calcule a complexidade, no pior caso, do fragmento de codigo abaixo:

Listing 2: Código

int i , j , s ;
s = 0 ;
    for ( i =1; i < N−1; i ++){           // i executa N - 2vezes
        for ( j =1; j < 2∗N; j ++){       // j executa 2N - 1
            s = s + 1 ;                   // resultado pior dos casos O(n^2)
        }
    }
*/


//6) Escreva um algoritmo que determine se um valor V encontra-se em um arranjo de n elementos. Escreva a equação de tempo de execução do seu algoritmo.

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

//f(x) = O(n)


//7) Escreva um algoritmo que encontre o menor elemento de um arranjo A com n elementos. Encontre a equação do tempo de execução do algoritmo.

#include<stdio.h>

int checaMenor(int vetor[], int tamanho){
    int menor = vetor[0];

    for (int i = 1; i < tamanho; i++){ 
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

//f(x) = O(n)
