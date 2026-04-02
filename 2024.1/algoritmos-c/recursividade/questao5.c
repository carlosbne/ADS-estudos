#include <stdio.h>

int mdc_recusivo(int n1, int n2){
    if(n2 == 0){
        return n1;
    } else {
        return mdc_recusivo(n2, n1 % n2);
    }
}
int main(){
    int x = 252;
    int y = 105;

    printf("%d \n", mdc_recusivo(x, y));
}