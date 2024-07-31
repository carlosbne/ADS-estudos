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