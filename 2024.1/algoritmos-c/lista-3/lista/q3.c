/*3) Escreva um algoritmo que receba um vetor ordenado e um numero extra e insira esse número na
sua posição correta no vetor ordenado, deslocando os outros números se for necessario. Quais a
sua função de custo e ordens de complexidade O.*/

#include <stdio.h>

void posicaoCorreta(int vetor[], int tamanho, int elemento) {
    for (int i = 0; i < tamanho; i++) {                   // 2 - executa i n vezes
        if (vetor[i] > elemento) {                        // 2(n) acesso e compara
            for (int j = tamanho; j > i; j--) {           // 2 inicia j executa j n vezes
                vetor[j] = vetor[j - 1];                  // 
            }
            vetor[i] = elemento;
            break;
        }
    }
    printf("novoVetor: ");
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n");
}

int main() {
    int vetor[6] = {1, 2, 3, 5, 6};
    int numero = 4;
    int tamanho = sizeof(vetor) / sizeof(vetor[0]);

    posicaoCorreta(vetor, tamanho, numero);

    return 0;
}

//f(n) = O(n^2) / n^3