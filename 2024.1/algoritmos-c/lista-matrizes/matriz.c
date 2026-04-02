/* #include <stdio.h> */

#define SIZE 5 // Tamanho da matriz

// Função para contar o número de minas vizinhas a uma célula
int countMines(int row, int col, int matrix[SIZE][SIZE]) {
    int count = 0;
    for (int i = row - 1; i <= row + 1; i++) {
        for (int j = col - 1; j <= col + 1; j++) {
            if (i >= 0 && i < SIZE && j >= 0 && j < SIZE && matrix[i][j] == 1) {
                count++;
            }
        }
    }
    return count;
}

// Função principal
int main() {
    int field[SIZE][SIZE] = {
        {0, 1, 0, 0, 1},
        {1, 0, 1, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 1, 1, 0, 0},
        {1, 0, 0, 0, 1}
    };

    printf("Campo Minado:\n");
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            printf("%d ", field[i][j]);
        }
        printf("\n");
    }

    printf("\nResultado:\n");
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (field[i][j] == 1) {
                printf("* ");
            } else {
                int count = countMines(i, j, field);
                printf("%d ", count);
            }
        }
        printf("\n");
    }


int ordenar(int vetor[], int numero){
    int vetor[]
    for(int i = 0; i < ; i++){
        if(vetor[i] > numero){
            
        }
    }
}        









    







    





    

    return 0;
}