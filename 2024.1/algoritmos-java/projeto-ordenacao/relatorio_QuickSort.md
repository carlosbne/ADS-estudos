# Relatorio

## QuickSort
O QuickSort é um algoritmo eficiente e bastante utilizado, porém com algumas complicações, isso porque seu desempenho depende da primeira etapa do algoritmo, que é a escolha de um número pivô da lista, esse número é escolhido à critério do desenvolvedor, ele pode ser o primeiro valor do array, o último, o do meio, entre outros. Assim como o MergeSort, o QuickSort também é um algoritmo baseado na técnica de divisão e conquista. O funcionamento do QuickSort ocorre da seguinte forma: 
Divisão: como já dito, o primeiro a se fazer é definir um pivô, aqui no caso é o último número da lista (código C), depois disso, o array é organizado num processo de partição, onde todos os números menores que o pivô ficam do lado esquerdo do array, e todos os maiores ficam do lado direito (função troca do código C para os valores ficarem nas posições certas a depender do pivô), dividindo a lista em duas metades e fazendo com que o pivô inicial já fique em sua posição correta (função particao do código C). 
Conquista: Cada metade do array fará o mesmo processo de partição novamente de forma recursiva até que todas as sublistas estejam ordenadas, fazendo com que a lista inicial acabe ficando também ordenada (função quicksort do código C).

### Implementação
A algoritmo foi implementado em duas linguagens diferentes, poderá conferir abaixo o trecho de código da função em Java e C.

>

Código em Java:
```java
 static void quicksort(int arr[], int inicio, int fim){
        if(inicio >= fim){
            return;
        }

        int pivor = arr[fim];
        int ladoA = particao(arr, inicio, fim, pivor);

        quicksort(arr, inicio, ladoA - 1);
        quicksort(arr, ladoA + 1, fim);

    }

    static int particao(int arr[], int inicio, int fim, int pivor){
        int ladoA = inicio;
        int ladoB = fim -1;

        while(ladoA < ladoB){

            while (arr[ladoA] <= pivor && ladoA < ladoB) {
                ladoA++;
            }

            while(arr[ladoB] >= pivor && ladoA < ladoB){
                ladoB--;
            }

            troca(arr, ladoA, ladoB);
        }

        if(arr[ladoA] > arr[fim]){
            troca(arr, ladoA, fim);
        } else {
            ladoA = fim;
        }

        return ladoA;
    }

    static void troca(int arr[], int indexA, int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
```



Código em C: 
```C
void troca(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int particao(int lista[], int ladoE, int ladoD) {
    int pivo = lista[ladoD];
    int i = ladoE - 1;

    for (int j = ladoE; j < ladoD; j++) {
        if (lista[j] < pivo) {
            i++;
            troca(&lista[i], &lista[j]);
        }
    }
    troca(&lista[i + 1], &lista[ladoD]);
    return (i + 1);
}

void quicksort(int lista[], int ladoE, int ladoD) {
    if (ladoE < ladoD) {
        int p = particao(lista, ladoE, ladoD);

        quicksort(lista, ladoE, p - 1);
        quicksort(lista, p + 1, ladoD);
    }
}

```

>

### Testes (Java)



| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------:  | :------------------ | :-------------------- |
| 10      | 00 / 00 / 00 / 00 / 00                | 00                   |  0,0000 |
| 100     | 00 / 00 / 00 / 00 / 00                | 00                   |  0,0000 |
| 1000    | 01 / 00 / 00 / 00 / 01                | 00                   |  0,0004 |
| 10000   | 02 / 04 / 04 / 03 / 04                | 04                   |  0,0034 |
| 100000  | 40 / 35 / 31 / 27 / 44                | 35                   |  0,0354 |



[![image.png](https://i.postimg.cc/0Qs460Wg/image.png)](https://postimg.cc/HJ6zRX13)



### Testes (C) 

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :--------------------|
| 10      | 0,001 / 0,002 / 0,002 / 0,002 / 0,001 | 0,00160             |  0,000001 |
| 100     | 0,006 / 0,006 / 0,006 / 0,009 / 0,006 | 0,00700             |  0,000007 |
| 1000    | 0,073 / 0,095 / 0,074 / 0,104 / 0,106 | 0,09400             |  0,000094 |
| 10000   | 1,184 / 0,959 / 0,932 / 0,956 / 0,934 | 0,99300             |  0,000993 |
| 100000  | 11,58 / 11,64 / 12,07 / 15,64 / 12,60 | 12,7060             |  0,012706 |



[![image.png](https://i.postimg.cc/DzRtFb4D/image.png)](https://postimg.cc/nsYdGrkY)



**Nota:** Os testes foram efetuados em computadores com diferentes capacidade de processamento, o que pode influenciar no resultado final da comparação.

### Análise de Complexidade

A complexidade do algoritmo é analisada no pior e melhor caso, considerando a quantidade de comparações e trocas necessárias para ordenar a lista de elementos.

**Pior caso**: O(n^2), ocorre quando o pivô escolhido é o menor ou o maior elemento a cada iteração, como em um array já ordenado ou inversamente ordenado, e o algoritmo acaba não conseguindo dividir a lista de forma balanceada. Isso leva o QuickSort a realizar muitas comparações desnecessárias, resultando em uma complexidade quadrática.

**Melhor caso**: O(n*logn), ocorre quando o pivô escolhido divide a lista em duas metades quase iguais a cada iteração. Neste caso, o algoritmo atinge o máximo de eficiência, pois as subdivisões são balanceadas, e o número de comparações é minimizado.

No geral, o QuickSort tem uma excelente performance média de O(n*logn), tornando-o mais rápido que algoritmos como Bubble Sort e Selection Sort para a maioria dos casos. No entanto, seu desempenho pode degradar para O(n^2) em cenários onde a escolha do pivô é desfavorável.

