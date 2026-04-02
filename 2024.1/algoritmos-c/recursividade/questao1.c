#include <stdio.h>

void imprimir(int n){
    if(n == 0){
        return;
    } else {
        printf("%d \n", n);
        return imprimir(n-1);
    }
}

int main(){
    int n = 5;
    imprimir(n);
}