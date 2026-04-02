#include <stdio.h>

int recurRestoDiv(int n, int d){
    if(n == 0 || d == 1){
        return 0; 
    } else if(n < d){
        return n;
    } else {
        return recurRestoDiv((n - d), d);
    }

}

int main(){
    int x = 17;
    int y = 3;

    printf("resto da divisão: %d \n", recurRestoDiv(x, y));
}