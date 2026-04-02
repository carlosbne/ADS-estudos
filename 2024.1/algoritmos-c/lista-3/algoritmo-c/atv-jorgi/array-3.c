#include <stdio.h>

/* Adicionar um inteiro ao final do vetor.
Retorna o novo tamanho do vetor. */
int append_int(int a[], int tamanho, int capacidade, int x){
/*       {1 3 2}
indice   0 1 2 */
    if (tamanho == capacidade){
        return tamanho;
    }
    a[tamanho] = x;

    return tamanho + 1;
}
    
/* Adicionar um inteiro em um local do vetor */
int insert_int(int a[], int tamanho, int capacidade, int x){
/*       {1 3 2 4 6}
indice    0 1 2 3 4
        {1 3 9 2 4 6} <- antes de adicionar o elemento no indici especifico, é necessário deslocar os demais elementos para a direita.
*/
    if (tamanho == capacidade){
        return tamanho;
    }
    a[tamanho] = x;

    return tamanho + 1;
}


void print_vector(int a[], int tamanho){
        printf("{ ");
        int i;
        for (i = 0; i < tamanho; ++i){
            printf("%d ", a[i]);
        }
        printf("}\n");
        
    }

int main(){
    int capacidade = 100, tamanho = 0;
    int a[capacidade];

    tamanho = append_int(a, tamanho, capacidade, 10);
    print_vector(a, tamanho);
    tamanho = append_int(a, tamanho, capacidade, 21);
    print_vector(a, tamanho);


    return 0;
}