#include <stdio.h>

#define TAMANHO 5

int main() {
    // Inicializando a matriz 5x5 com números reais específicos
    double matriz[TAMANHO][TAMANHO] = {
        {1.1, 2.2, 3.3, 4.4, 5.5},
        {6.6, 7.7, 8.8, 9.9, 10.1},
        {11.2, 12.3, 13.4, 14.5, 15.6},
        {16.7, 17.8, 18.9, 19.1, 20.2},
        {21.3, 22.4, 23.5, 24.6, 25.7}
    };

    double diagonal[TAMANHO];

    // Extraindo a diagonal principal
    for (int i = 0; i < TAMANHO; i++) {
        diagonal[i] = matriz[i][i];
    }

    // Imprimindo o vetor da diagonal principal
    printf("Vetor da diagonal principal:\n");
    for (int i = 0; i < TAMANHO; i++) {
        printf("%lf ", diagonal[i]);
    }
    printf("\n");

    return 0;
}
