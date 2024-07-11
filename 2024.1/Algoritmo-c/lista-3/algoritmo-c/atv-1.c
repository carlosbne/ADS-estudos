#include <stdio.h>

void swap(int *a, int *b){
    int auxiliar = *a;
    *a = *b;
    *b = auxiliar;
}

int main ( ) {
    int i = 3 , j = 5 ;
    int *p , *q;
    p = &i ;
    q = &j ;

    if(*q == &j){
        printf("True\n");
    }
    else{
        printf("False\n");
    }
    return 0 ;

}