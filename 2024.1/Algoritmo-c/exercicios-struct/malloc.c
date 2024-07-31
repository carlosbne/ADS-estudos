#include <stdio.h>
#include <stdlib.h>

int main(void) {

  int *a;
  int n;
  scanf("%d", &n);
  a = (int*)malloc(sizeof(int) * n);
  for(int i = 0; i < n; i++)
    scanf("%d", &a[i]);
  for(int i = 0; i < n; i++)
    printf("%d ", a[i]);
  printf("\n");
  return 0;
}
/* 
#include <stdio.h>
#include <stdlib.h>

int main(void) {

  int *a;
  int n;
  scanf("%d", &n);
  a = (int*)malloc(sizeof(int) * n);
  printf("Endereço do início da memória: " "%p (%lld)\n", a, (long long)a); // Verifica local do indereço da memoria 
  if(a == 0){
    printf("ERRO ao alocar memória");
    exit(1);
  }
  for(int i = 0; i < n; i++)
    scanf("%d", &a[i]);
  for(int i = 0; i < n; i++)
    printf("%d ", a[i]);
  printf("\n");
  free(a);
  return 0;
} */