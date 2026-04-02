# Relatorio

## InsertionSort
Assim como o BubbleSort, o Insertion Sort também é um algoritmo de ordenação simples e funcional em listas pequenas ou quase ordenadas, mas acaba sendo ineficiente ao tratar de listas grandes. O funcionamento do InsertionSort ocorre da seguinte forma: a análise começa a partir do segundo número da lista, esse número é comparado com o anterior, colocando ele em sua frente caso seja menor (como mostrado a partir da linha 6 do código Java e linha 7 do código C). Após isso, todo o resto da análise da lista segue semelhante, conforme o array é percorrido, o número da vez é comparado com todos os anteriores dentro do array e coloca à sua direita todos que forem maiores que ele, fazendo com que o número da vez fique em sua posição correta. Isso acontece até a lista estar totalmente ordenada.

### Implementação
A algoritmo foi implementado em duas linguagens diferentes, poderá conferir abaixo o trecho de código da função em Java e C.

Código em Java:
```java
public void insertionSort(int arr[]){

        for(int i = 0; i < arr.length; i++){
            int verifica = i;                                         //define primeiro elemento a ser verificado como o incial

            while(verifica > 0 && arr[verifica] < arr[verifica - 1]){ //enquanto verif > 0 E o elemento na posiçao verificada < q posição verif-1
        
                int temp = arr[verifica];                             //caso seja menor efetua a troca de posiçãoa
                arr[verifica] = arr[verifica - 1];
                arr[verifica - 1] = temp;
                verifica -= 1;
            }
        }
    }
```
Código em C: 
```C
int insertionsort(int lista[], int n){

    for (int i = 1; i < n; i++) {
        int aux = lista[i];
        int j = i - 1;
        
        while (j >= 0 && lista[j] > aux) {
            lista[j + 1] = lista[j];
            j--;
        }
        lista[j + 1] = aux;
    }
    
    return 0;
}
```


### Testes (Java)



| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------:  | :------------------ | :-------------------- |
| 10      | 00 / 01 / 00 / 01 / 00                | 00                   |  0,0004 |
| 100     | 00 / 01 / 01 / 00 / 02                | 01                   |  0,0008 |
| 1000    | 06 / 13 / 00 / 06 / 07                | 06                   |  0,0064 |
| 10000   | 79 / 79 / 82 / 83 / 75                | 79                   |  0,0796 |
| 100000  | 5389 / 4841 / 4886 / 4957 / 5460      | 4957                 |  5,1066 |



[![image.png](https://i.postimg.cc/0NqVJn5d/image.png)](https://postimg.cc/HrBwqQyV)



### Testes (C)

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :--------------------|
| 10      | 0,001 / 0,001 / 0,000 / 0,001 / 0,000 | 0,0006              |  0,000006 |
| 100     | 0,001 / 0,001 / 0,001 / 0,001 / 0,001 | 0,0010              |  0,000010 |
| 1000    | 0,005 / 0,004 / 0,005 / 0,006 / 0,004 | 0,0048              |  0,000048 |
| 10000   | 0,035 / 0,035 / 0,036 / 0,034 / 0,035 | 0,0350              |  0,000350 |
| 100000  | 0,335 / 0,335 / 0,336 / 0,335 / 0,336 | 0,3354              |  0,003354 |



[![image.png](https://i.postimg.cc/qRfQS6Gp/image.png)](https://postimg.cc/yJPFSd5G)



**Nota:** Os testes foram efetuados em computadores com diferentes capacidade de processamento, o que pode influenciar no resultado final da comparação.

### Análise de Complexidade

A complexidade do algoritmo é analisada no pior e melhor caso, considerando a quantidade de comparações e trocas necessárias para ordenar a lista de elementos.

**Pior caso**: O(n^2), ocorre quando o array está invertido.

**Melhor caso**: O(n), ocorre quando o array já está ordenado.

A diferença na complexidade acontece porque o Insertion Sort é eficiente para listas pequenas ou quase ordenadas, realizando menos trocas nessas situações. Porém, assim como o Bubble Sort, ele não é ideal para listas grandes que estejam totalmente desorganizadas.
