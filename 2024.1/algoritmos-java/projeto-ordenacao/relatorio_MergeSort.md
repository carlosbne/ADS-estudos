# Relatorio

## MergeSort
Até então, o MergeSort é o algoritmo de ordenação mais eficiente dentre os apresentados, isso porque ele utiliza a técnica de divisão e conquista e funciona muito bem até mesmo com listas grandes. O funcionamento do MergeSort ocorre da seguinte forma:
Divisão - como o nome sugere, o algoritmo primeiramente divide a lista inicial em duas metades, o lado esquerdo e o lado direito, de forma recursiva, até que restem apenas 1 número nos dois lados da lista, como é mostrado no código na função mergesort (a partir da linha 3 do código C).
Conquista - após a etapa de Divisão ter sido realizada, o processo de conquista (função merge) faz com que cada subarray dividido seja mesclado em pares (linhas 19-22 do código C) e de forma já ordenada (linhas 28-37 do código C), começando com o primeiro par, que seria o único número do lado esquerdo com o único número do lado direito, depois, na recursividade, o único par do lado direito com o único par do lado esquerdo, e assim sucessivamente até a finalização da recursividade e da ordenação por completo.

### Implementação
A algoritmo foi implementado em duas linguagens diferentes, poderá conferir abaixo o trecho de código da função em Java e C.

>

Código em Java:
```java
public void mergeSort(int arr[]){ 
        int tam = arr.length;
        if(tam < 2){
            return;
        }
        
        //define o tamnho e cria duas arrays
        int meio = tam/2;
        int[] ladoA = new int[meio];
        int[] ladoB = new int[tam - meio];

        //copia os dados da array principal para as duas temporarias
        for(int i = 0; i < meio; i++){
            ladoA[i] = arr[i];
        }
        for(int i = meio; i < tam; i++){
            ladoB[i - meio] = arr[i];
        }
        mergeSort(ladoA);
        mergeSort(ladoB);

        //chamada função merge passando as array temporarias
        merge(arr, ladoA, ladoB);
    }

    public void merge(int arr[], int ladoA[], int ladoB[]){
        int tamA = ladoA.length;
        int tamB = ladoB.length;

        int i = 0, j = 0, k = 0;        //variaveis para interar as array i = tamA, j = tamB, k = arr

        while(i < tamA && j < tamB){
            if(ladoA[i] <= ladoB[j]){
                arr[k] = ladoA[i];
                i++;
            } else {
                arr[k] = ladoB[j];
                j++;
            }
            k++;
        }
        while(i < tamA){
            arr[k] = ladoA[i];
            i++;
            k++;
        }
        while(j < tamB){
            arr[k] = ladoB[j];
            j++;
            k++;
        }
    }
```

Código em C: 
```C
void mergesort(int lista[], int ladoE, int ladoD) {
    if (ladoE < ladoD) {
        int meio = ladoE + (ladoD - ladoE) / 2;

        mergesort(lista, ladoE, meio);
        mergesort(lista, meio + 1, ladoD);

        merge(lista, ladoE, meio, ladoD);
    }
}

void merge(int lista[], int ladoE, int meio, int ladoD) {
    int tamE = meio - ladoE + 1;
    int tamD = ladoD - meio;

    int *ladoEArray = (int*)malloc(tamE * sizeof(int));
    int *ladoDArray = (int*)malloc(tamD * sizeof(int));

    for (int i = 0; i < tamE; i++)
        ladoEArray[i] = lista[ladoE + i];
    for (int j = 0; j < tamD; j++)
        ladoDArray[j] = lista[meio + 1 + j];

    int i = 0;
    int j = 0;
    int k = ladoE;

    while (i < tamE && j < tamD) {
        if (ladoEArray[i] <= ladoDArray[j]) {
            lista[k] = ladoEArray[i];
            i++;
        } else {
            lista[k] = ladoDArray[j];
            j++;
        }
        k++;
    }

    while (i < tamE) {
        lista[k] = ladoEArray[i];
        i++;
        k++;
    }

    while (j < tamD) {
        lista[k] = ladoDArray[j];
        j++;
        k++;
    }

    free(ladoEArray);
    free(ladoDArray);
}

```

>

### Testes (Java)

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------:  | :------------------ | :-------------------- |
| 10      | 00 / 00 / 00 / 00 / 00                | 00                   |  0,0000 |
| 100     | 00 / 00 / 00 / 00 / 01                | 00                   |  0,0002 |
| 1000    | 01 / 01 / 00 / 01 / 00                | 01                   |  0,0006 |
| 10000   | 03 / 05 / 05 / 03 / 04                | 04                   |  00,004 |
| 100000  | 72 / 31 / 71 / 32 / 86                | 71                   |  0,0584 |



[![image.png](https://i.postimg.cc/T32YbnsD/image.png)](https://postimg.cc/rKbkXRMV)



### Testes (C) 

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :--------------------|
| 10      | 0,004 / 0,002 / 0,002 / 0,003 / 0,002 | 0,00260             |  0,000002 |
| 100     | 0,012 / 0,012 / 0,016 / 0,012 / 0,011 | 0,01260             |  0,000012 |
| 1000    | 0,122 / 0,122 / 0,120 / 0,123 / 0,123 | 0,12200             |  0,000122 |
| 10000   | 1,43  /  1,51 /  1,49 /  1,48 /  1,72 | 1,52600             |  0,001526 |
| 100000  | 17,49 / 17,54 / 17,57 / 17,39 / 17,66 | 17,5300             |  0,017530 |


[![image.png](https://i.postimg.cc/s22V1SXg/image.png)](https://postimg.cc/CRWyQRk3)



**Nota:** Os testes foram efetuados em computadores com diferentes capacidade de processamento, o que pode influenciar no resultado final da comparação.

### Análise de Complexidade

A complexidade do algoritmo é analisada no pior e melhor caso, considerando a quantidade de comparações e operações necessárias para ordenar a lista de elementos.

**Pior caso**: O(n*logn), ocorre quando a lista está completamente desordenada. O MergeSort divide a lista recursivamente em metades, e, em seguida, combina essas metades ordenadas, resultando em um processo eficiente, mesmo no pior cenário.

**Melhor caso**: O(n*logn), mesmo quando a lista já está ordenada, o MergeSort ainda divide a lista e executa o processo de combinação, o que mantém a complexidade O(n log n) independentemente da ordem inicial dos elementos.

O MergeSort mantém uma complexidade de tempo O(n*logn) tanto no melhor quanto no pior caso, pois o algoritmo divide recursivamente a lista e realiza a fusão dos elementos em ordem. Além disso, o MergeSort é mais eficiente do que algoritmos como o Bubble Sort ou o Selection Sort para listas grandes, embora ele requer mais espaço em memória devido à necessidade de armazenar temporariamente as sublistas criadas durante sua execução.
