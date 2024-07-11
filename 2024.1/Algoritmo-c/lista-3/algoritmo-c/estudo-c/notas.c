#include <stdio.h>

int main() {
    float notas[5] = {0};
/*     float total = 0;
    float media = 0; */

    printf("Insira 5 notas: \n");

    for (int i = 0; i < 5; i++){
        scanf("%f", &notas[i]);
    }
    
    printf("o array: { ");
    for (int i = 0; i < 5; i++){
        printf("%.2f ", notas[i]);
    }
    printf("} ");


    return 0;
}