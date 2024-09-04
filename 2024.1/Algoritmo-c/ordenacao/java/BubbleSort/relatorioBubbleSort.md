# Relatorio

## BubbleSort
Dentre os algoritmos de ordenação de listas, o BubbleSort é um dos mais simples, sendo bastante utilizado por sua simplicidade, embora seja ineficiente em certos cenários. O funcionamento do BubbleSort ocorre da seguinte forma: primeiro, é utilizado um comando de repetição para percorrer a lista da esquerda para a direita, como ilustrado nas linhas 5 e 6 do código na seção de Implementação. Durante esse processo, uma comparação é feita entre o elemento atual e o próximo na lista (linha 7). Se o próximo elemento for menor que o atual, ocorre a troca de posições entre eles. Caso contrário, a lista continua sendo percorrida sem alterações. Esse processo se repete até que todos os elementos estejam ordenados.

### Implementação
A algoritmo foi implementado em duas linguagens diferentes, poderá conferir abaixo o trecho de código da função em Java e C.

Código em Java:
```java
void bubbleSort(int arr[]) {
      int len = arr.length;                   //tamanho do array
      int temp;                               //variavel temporária para troca

      for (int i = 0; i < len - 1; i++) {     //loop para cada elemento
        for (int j = 0; j < len - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {          //verifica se o elemento ao lado é maior
            temp = arr[j];                    //usa o temp para auxiliar na troca
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
}
```
Código em C: 
```C
int bubblesort(int lista[], int n){
    int aux = 0;

    for (int i = 0; i < n - 1 ; i++){
        if(lista[i] > lista[i+1]){
            aux = lista[i];
            lista[i] = lista[i+1];
            lista[i+1] = aux;
        }
    }
    
    return 0;
}   
```


### Testes (Java)



| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :-------------------- |
| 10      | 4 / 6 / 6 / 5 / 4                     | 5                   |  0,005 |
| 100     | 5 / 5 / 15 / 6 / 8                    | 7,8                 |  0,0078 |
| 1000    | 26 / 21 / 21 / 28 / 20                | 23,2                |  0,0232 |
| 10000   | 174 / 194 / 178 / 187 / 196           | 185,8               |  0,1858 |
| 100000  | 17040 / 17037 / 17009 / 17149 / 17071 | 17061,2             |  17,0612 |


[![image.png](https://i.postimg.cc/htrKSPQS/image.png)](https://postimg.cc/pmpwCvB7)


### Testes (C)

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :--------------------|
| 10      | 0,001 / 0,001 / 0,001 / 0,001 / 0,001 | 0,001               |  0,00001  |
| 100     | 0,002 / 0,002 / 0,001 / 0,001 / 0,002 | 0,0016              |  0,000016 |
| 1000    | 0,003 / 0,003 / 0,002 / 0,002 / 0,003 | 0,0026              |  0,000026 |
| 10000   | 0,015 / 0,016 / 0,051 / 0,016 / 0,016 | 0,0228              |  0,000228 |
| 100000  | 0,148 / 0,149 / 0,189 / 0,148 / 0,148 | 0,1564              |  0,001564 |


[![image.png](https://i.postimg.cc/SxyGPk00/image.png)](https://postimg.cc/tYMPZ0CD)


**Nota:** Os testes foram efetuados em computadores com diferentes capacidade de processamento, o que pode influenciar no resultado final da comparação.

### Análise de Complexidade

A complexidade do algoritmo é analisada no pior e melhor caso, considerando a quantidade de comparações necessárias para ordenar a lista de elementos.

**Pior caso**: O(n^2), ocorre quando o array está invertido.
**Melhor caso**: O(n), ocorre quando o array já está ordenado.

A diferença na complexidade acontece porque o Bubble Sort é um algoritmo simples, mas não funciona bem com listas grandes ou que estão completamente desorganizadas. No entanto, ele pode ser bem rápido quando as listas já estão ordenadas ou quase ordenadas.

