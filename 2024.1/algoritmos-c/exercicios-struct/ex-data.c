#include <stdio.h>

struct data{
    short dia, mes;
    int ano;
};

int main(){
    struct data hoje, amanha;
    scanf("%hd %hd %d", &hoje.dia, &hoje.mes, &hoje.ano);
    printf("Hoje é %hd/%hd/%d\n", hoje.dia, hoje.mes, hoje.ano);
    return 0;
}