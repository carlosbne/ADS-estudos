#include <stdio.h>

int recurDivInteiro(int n, int d) {
  if (n == 0 || d == 1) {
    return 0;
  }
  int qtd = 0;
  if (n < d) {
    return qtd;
  } else {
    qtd++;
    return qtd + recurDivInteiro((n - d), d);
  }
}

int main() {
  int x = 16;
  int y = 2;

  printf("resultado divisao inteira: %d \n", recurDivInteiro(x, y));
}