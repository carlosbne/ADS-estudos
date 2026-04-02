# Algoritmos 2024.1

Exercícios - estruturas de seleção

##### Questão 1

```c
#include <stdio.h>

int main(){
    int x;
    scanf("%d", &x);

    if(x > 0){
        printf("Maior do que zero");
    }
    else if(x < 0){
        printf("Menor do que zero");
    }
    else{
        printf("Zero");
    }

    return 0;
}
```

##### Questão 2

```c
#include <stdio.h>

int main(){
    int x, y;
    scanf("%d %d", &x, &y);

    int maior = x;
    int menor = y;

    if(y > maior){
        maior = y;
        menor = x;
    }

    printf("%d\n", maior);
    printf("%d\n", menor);

    return 0;
}
```

##### Questão 3

```c
#include <stdio.h>

int main(){
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);

    float result = (a + b + c + d) / 4.0;
    
    printf("%.1f \n", result);

    if(a > result){
        printf("%d\n", a);
    }
    if(b > result){
        printf("%d\n", b);
    }
    if(c > result){
        printf("%d\n", c);
    }
    if(d > result){
        printf("%d\n", d);
    }

    return 0;
}
```
##### Questão 4
```c
#include <stdio.h>

int main(){
    int a, b, c, d;
    scanf("%d", a);
    scanf("%d", b);
    scanf("%d", c);
    scanf("%d", d);

    int reais = a + c;
    int centavos = b + d;
}
```

##### Questão 6

```c
#include <stdio.h>

int main(){
    int a;
    scanf("%d", &a);

    if(a % 2 == 0){
        printf("par");
    }
    else{
        printf("impar");
    }
}
```

##### Questão 7

```c
#include <stdio.h>

int main(){
    int x;
    scanf("%d", &x);

    if(x >= 5 && x <= 7){
        printf("Infantil A");
    }
    else if(x >= 8 && x <= 10){
        printf("Infantil B");
    }
    else if(x >= 11 && x <= 13){
        printf("Juvenil A");
    }
    else if(x >= 14 && x <= 17){
        printf("Juvenil B");
    }
    else if(x >= 18){
        printf("Adulto");
    }

    return 0;
}
```
#### Lista 02
##### Questão 3

```c
#include <stdio.h>

int main(){
    int x;
    scanf("%d", &x);

    switch (x)
    {
    case 1:
        printf("Janeiro");
        break;
    case 2:
        printf("Fevereiro");
        break;
    case 3:
        printf("Março");
        break;
    case 4:
        printf("Abri");
        break;
    case 5:
        printf("Maio");
        break;
    case 6:
        printf("Junho");
        break;
    case 7:
        printf("Julho");
        break;
    case 8:
        printf("Agosto");
        break;
    case 9:
        printf("Setembro");
        break;
    case 10:
        printf("Outubro");
        break;
    case 11:
        printf("Novembro");
        break;
    case 12:
        printf("Dezembro");
        break;
    default:
        printf("mes invalido");
        break;
    }
}
```

##### Questão 9

```c
#include <stdio.h>
#include <math.h>

int main(){
    int x;
    printf("Menu de opcoes:\n");
    printf("1- Soma de dois numeros\n2- Raiz quadrada de um numero\n");
    scanf("%d", &x);

    if(x == 1){
        int a, b;
        scanf("%d %d", &a, &b);
        int c = a + b;
        printf("%d", c);
    }
    else if(x == 2){
        float y;
        scanf("%f", &y);
        printf("%.1f", pow(y,2));
    }
    
}
```

##### Questão 10

```c
#include <stdio.h>
int volume(int largura1, int altura1, int profundidade1, int largura2, int altura2, int profundidade2){
    x1 = (2 * largura1 * altura1) + (2 * altura1 * profundidade1) + (2 * largura1 * profundidade1);
    x2 = (2 * largura2 * altura2) + (2 * altura2 * profundidade2) + (2 * largura2 * profundidade2);
    
    if(x1 == x2){
        return 0;
    }
    else if(x1 > x2){
        return 1;
    }
    else if(x2 > x1){
        return 2;
    }
}
int main(){
    int largura1, altura1, profundidade1;
    int largura2, altura2, profundidade2;

    scanf("%d %d %d", &largura1, &altura1, &profundidade1);
    scanf("%d %d %d" ,&largura2, &altura2, &profundidade2);

    printf("%d\n", volume(largura1, altura1, profundidade1,
    largura2, altura2, profundidade2));

    return 0;
}
```


### Código em C

Inserir um número em um vetor ordenado:

```c
#include <stdio.h>

void insereOrdenado(int vetor[], int *tamanho, int numero) {
    int i;

    // Encontrar a posição onde o número deve ser inserido
    for (i = *tamanho - 1; (i >= 0 && vetor[i] > numero); i--) {
        vetor[i + 1] = vetor[i];  // Deslocar elementos para a direita
    }

    // Inserir o número na posição correta
    vetor[i + 1] = numero;
    (*tamanho)++;  // Incrementar o tamanho do vetor
}

int main() {
    int vetor[6] = {1, 2, 4, 5, 6};  // Inicialmente com 5 elementos, mas espaço para 6
    int tamanho = 5;
    int numero = 3;

    insereOrdenado(vetor, &tamanho, numero);

    // Imprimir o vetor atualizado
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\\n");

    return 0;
}

```

### Análise da Complexidade

Analisar a função `insereOrdenado` passo a passo.

### Passo 1: Encontrar a posição de inserção

```c
for (i = *tamanho - 1; (i >= 0 && vetor[i] > numero); i--) {
    vetor[i + 1] = vetor[i];  // Deslocar elementos para a direita
}

```

- Este loop percorre o vetor de trás para frente para encontrar a posição correta onde o `numero` deve ser inserido.
- No pior caso, o `numero` é menor que todos os elementos do vetor, então precisamos deslocar todos os elementos, resultando em `tamanho` iterações.

### Passo 2: Inserir o número

```c
vetor[i + 1] = numero;
(*tamanho)++;

```

- Essas operações são constantes, ou seja, O(1).

### Função de Custo e Ordem de Complexidade

### Melhor Caso

- No melhor caso, o `numero` é maior que todos os elementos do vetor, então é inserido no final sem necessidade de deslocar elementos.
- Complexidade: O(1)

### Pior Caso

- No pior caso, o `numero` é menor que todos os elementos do vetor, então todos os elementos precisam ser deslocados uma posição para a direita.
- Complexidade: O(n), onde `n` é o número de elementos no vetor.

### Complexidade Média

- Em média, o `numero` será inserido em algum lugar no meio do vetor, então metade dos elementos precisará ser deslocada.
- Complexidade média: O(n/2), mas descartamos constantes em notação O, resultando em O(n).

### Resumo

A função `insereOrdenado` tem complexidade:

- **Melhor caso**: O(1) - Quando o número é inserido no final do vetor.
- **Pior caso**: O(n) - Quando todos os elementos precisam ser deslocados.
- **Complexidade média**: O(n) - Em média, metade dos elementos precisam ser deslocados.

Isso significa que, em geral, o tempo de execução do algoritmo cresce linearmente com o tamanho do vetor, o que é considerado eficiente para a maioria das aplicações práticas.