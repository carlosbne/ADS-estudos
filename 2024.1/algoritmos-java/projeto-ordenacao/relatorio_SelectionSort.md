# Relatorio

## SelectionSort
Assim como o InsertionSort, o SelectionSort não é um algoritmo tão eficiente por causa de sua ordem de complexicade quadrática, apesar disso, também é visto como um algoritmo simples e funcional em listas que não sejam grandes. O funcionamento do SelectionSort ocorre da seguinte forma: primeiro, a lista inteira é percorrida na procura do menor número do array, depois disso, esse número é colocado na primeira parte, agora ordenada, da lista, dividindo ela em duas partes: ordenada e ainda não ordenada (como é mostrado nos laços a partir da linha 3 do código Java e linha 6 do código C). O mesmo acontece no restante do algoritmo, o menor número da parte desordenada é procurado e depois colocado na lista na parte dos números ordenados, e assim segue até o fim do algoritmo.

### Implementação
A algoritmo foi implementado em duas linguagens diferentes, poderá conferir abaixo o trecho de código da função em Java e C.

Código em Java:
```java
public void selectionSort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){ 
            int menor = i;                              //define o menor como primeiro elemento

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[menor]){                //procura menor elemento a partir do i+1 até o último elemento
                    menor = j;                          
                }
            }

            if(menor != i){                             //se houver, troca o menor elemento encontrado com a posiçao atual da verificação
                int temp = arr[i];
                arr[i] = arr[menor];
                arr[menor] = temp; 
            }
        }
    }
```
Código em C: 
```C
int selectionsort(int lista[], int n){

    int min = 0;
    int aux = 0;

    for(int i = 0; i < n; i++){
        min = i;
        for(int j = i; j < n; j++){
            if(lista[j] < lista[min]){
                min = j;
            }
        }
        if(min != i){           // tem troca
            aux = lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }
    }
    
    return 0;
}
```


### Testes (Java)



| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------:  | :------------------ | :-------------------- |
| 10      | 00 / 00 / 00 / 01 / 00                | 00                   |  0,0002 |
| 100     | 00 / 01 / 01 / 00 / 00                | 00                   |  0,0004 |
| 1000    | 03 / 05 / 05 / 05 / 03                | 05                   |  0,0042 |
| 10000   | 137 / 135 / 133 / 141 / 139           | 137                  |  00,137 |
| 100000  | 3447 / 3521 / 3609 / 3494 / 3506      | 3506                |  3,5154 |



[![image.png](https://i.postimg.cc/Pxgnvw7G/image.png)](https://postimg.cc/7GnWpfDX)



### Testes (C) 

| Entrada |  Tempo de Execução (ms)               | Média de Tempo (ms) |  Média de Tempo (s)  |
| :-----: | :-----------------------------------  | :------------------ | :--------------------|
| 10      | 0,002 / 0,002 / 0,001 / 0,002 / 0,001 | 0,00016             |  0,000001 |
| 100     | 0,009 / 0,009 / 0,008 / 0,009 / 0,009 | 0,00088             |  0,000008 |
| 1000    | 0,722 / 0,699 / 0,716 / 0,692 / 0,688 | 0,70300             |  0,000703 |
| 10000   | 70    /    69 /    69 /    69 /    69 | 69,2000             |  0,069200 |
| 100000  | 7197  / 7145  / 7172  / 7213  / 7197  | 7184,80             |  7,184800 |



[![image.png](https://i.postimg.cc/mgtvGM79/image.png)](https://postimg.cc/yDCQmDQ6)



**Nota:** Os testes foram efetuados em computadores com diferentes capacidade de processamento, o que pode influenciar no resultado final da comparação.

### Análise de Complexidade

A complexidade do algoritmo é analisada no pior e melhor caso, considerando a quantidade de comparações e trocas necessárias para ordenar a lista de elementos.

**Pior caso**: O(n^2), ocorre em qualquer situação, independentemente da ordem inicial, pois o Selection Sort sempre percorre toda a lista para encontrar o menor (ou maior) elemento em cada iteração.

**Melhor caso**: O(n^2), mesmo quando o array já está ordenado, ele continua comparando todos os elementos a cada passagem, independentemente da ordem da lista.

A complexidade do Selection Sort permanece quadrática em todos os casos, pois ele realiza o mesmo número de comparações, independentemente de o array já estar ordenado ou não. Porém, ele tende a realizar menos trocas que o Bubble Sort, o que pode ser uma vantagem dependendo da situação.
