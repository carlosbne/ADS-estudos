#include <stdio.h>

#define LINHAS 4
#define COLUNAS 8

int main() {
    // Inicializando a matriz com números inteiros específicos
    int MAT[LINHAS][COLUNAS] = {
        {1, 2, 3, 4, 5, 6, 7, 8},
        {9, 10, 11, 12, 13, 14, 15, 16},
        {17, 18, 19, 20, 21, 22, 23, 24},
        {25, 26, 27, 28, 29, 30, 31, 32}
    };
    
    int soma_linha[LINHAS] = {0};
    int soma_coluna[COLUNAS] = {0};
    
    // Imprime a matriz
    printf("Matriz MAT:\n");
    for (int i = 0; i < LINHAS; i++) {
        for (int j = 0; j < COLUNAS; j++) {
            printf("%d\t", MAT[i][j]);
        }
        printf("\n");
    }
    
    // Calcula a soma dos elementos de cada linha
    for (int i = 0; i < LINHAS; i++) {
        for (int j = 0; j < COLUNAS; j++) {
            soma_linha[i] += MAT[i][j];
        }
    }
    
    // Calcula a soma dos elementos de cada coluna
    for (int j = 0; j < COLUNAS; j++) {
        for (int i = 0; i < LINHAS; i++) {
            soma_coluna[j] += MAT[i][j];
        }
    }
    
    // Imprime a soma dos elementos de cada linha
    printf("\nSoma dos elementos de cada linha:\n");
    for (int i = 0; i < LINHAS; i++) {
        printf("Linha %d: %d\n", i + 1, soma_linha[i]);
    }
    
    // Imprime a soma dos elementos de cada coluna
    printf("\nSoma dos elementos de cada coluna:\n");
    for (int j = 0; j < COLUNAS; j++) {
        printf("Coluna %d: %d\n", j + 1, soma_coluna[j]);
    }
    
    return 0;
}
