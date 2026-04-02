#include <stdio.h>

#define MAX 10

void lerMatriz(int N, double matriz[N][N]) {
    printf("Digite os elementos da matriz %dx%d:\n", N, N);
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            scanf("%lf", &matriz[i][j]);
        }
    }
}

void imprimirMatriz(int N, double matriz[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%lf ", matriz[i][j]);
        }
        printf("\n");
    }
}

void transporMatriz(int N, double matriz[N][N], double transposta[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            transposta[j][i] = matriz[i][j];
        }
    }
}

int main() {
    int N;
    printf("Digite a ordem da matriz (N): ");
    scanf("%d", &N);

    if (N > MAX) {
        printf("A ordem da matriz deve ser menor ou igual a %d\n", MAX);
        return 1;
    }

    double matriz[N][N];
    double transposta[N][N];

    lerMatriz(N, matriz);

    printf("Matriz original:\n");
    imprimirMatriz(N, matriz);

    transporMatriz(N, matriz, transposta);

    printf("Matriz transposta:\n");
    imprimirMatriz(N, transposta);

    return 0;
}
