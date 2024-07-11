#include <stdio.h>

int contadorDasMinas(int campo[5][5], int linhas, int colunas){
    int i, j;
    int contador = 0;
    for (i = linhas - 1; i <= linhas + 1; i++){
        for(j = colunas - 1; j <= colunas + 1; j++){
            if (i >= 0 && i < linhas &&
                j >= 0 && j < colunas && campo[i][j] == -1) {
                    contador++;
                }
        }
    }
    return contador;   
}




int main(int argc, char **argv){
    int linhas=0, colunas=0;
    scanf("%d", &linhas);
    scanf("%d", &colunas);
    
    int campo[linhas][colunas];
    
    for(int i = 0; i < linhas ; i++){
        for (int j = 0; j < colunas; j++){
            scanf("%d", &campo[i][j]);
        }
    }

    printf("Campo Minado:\n\n");
    for(int i = 0; i < linhas; i++){
        for (int j = 0; j < colunas; j++){
            printf("%2i\t", campo[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    
    printf("\nResultado:\n");
    for (int i = 0; i < linhas; i++){
        for (int j = 0; j < colunas; j++){
            if(campo[i][j] == -1){
                printf("* ");
            }
            else{
                int numero = contadorDasMinas(campo, i, j);
                printf("%d \t", numero);
            }
        }
        printf("\n");
    }
    

    return 0;
}