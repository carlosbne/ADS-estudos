# Problema do Jantar dos Filósofos

#### Aluno: Carlos Benigno Neto 

## Contexto inicial do trabalho (introdução)
A concorrência em sistemas computacionais envolve a execução simultânea de múltiplas threads que compartilham recursos, exigindo mecanismos adequados de sincronização. O Problema do Jantar dos Filósofos é um exemplo clássico utilizado para ilustrar esses desafios.

Neste problema, filósofos alternam entre pensar e comer, compartilhando talheres posicionados entre eles. Para comer, cada filósofo precisa adquirir dois talheres, o que pode levar a situações de impasse se o acesso aos recursos não for corretamente controlado. Este trabalho apresenta uma implementação do problema em Python, utilizando threads e locks, com foco na exclusão mútua, sincronização e prevenção de deadlock.

## Descrevendo a solução em Python para o jantar dos filósofos

A solução foi implementada em Python utilizando a biblioteca threading. Cada filósofo é representado por uma thread, enquanto cada talher é modelado como um Lock, garantindo exclusão mútua no acesso aos recursos compartilhados.

Os filósofos alternam entre pensar e comer. Para comer, é necessário obter dois talheres adjacentes, sendo aplicadas técnicas de sincronização e prevenção de impasse para evitar que filósofos vizinhos utilizem os mesmos recursos simultaneamente.

### Implementando o algoritmo

#### Qual o Algoritmo Utilizado

O algoritmo utiliza threads para representar os filósofos e locks para controlar o acesso aos talheres. A prevenção de deadlock é feita por meio da ordenação na aquisição dos recursos

#### Implementação do Algoritmo em Python
A classe ``Filosofo``, derivada de ``threading.Thread``, executa um ciclo contínuo de ``pensar -> tentar pegar os talheres -> comer -> devolver os recursos`` ao final de cada refeição, até chegar ao limite de refeições.

## Tratando Impasse

#### Qual a Estratégia de Tratamento de Impasses

O tratamento de impasse é realizado por meio da prevenção de deadlock, quebrando a condição de espera circular. Para isso, é utilizada a estratégia de hierarquia de recursos (quebra de simetria), onde os filósofos não adquirem os talheres na mesma ordem.

Filósofos com ID par tentam pegar primeiro o talher esquerdo, enquanto filósofos com ID ímpar tentam pegar primeiro o talher direito. Essa abordagem evita que ocorra a formação de um ciclo de espera, não permitindo o deadlock.

#### Implementação do Tratamento de Impasse em Python

No método ``pegar_talheres``, a ordem de aquisição dos locks é definida com base no ID do filósofo. Garante que os recursos sejam adquiridos de forma ordenada, prevenindo a ocorrência de impasse durante a execução concorrente.

``` Python
def pegar_talheres(self):
        """
        Filósofo tenta pegar os dois talheres.
        Para evitar deadlock, os filósofos ímpares pegam primeiro o talher direito.
        """
        if self.philosopher_id % 2 == 0:
            # Filósofos pares pegam primeiro o talher esquerdo
            primeiro_talher = self.talher_esquerdo
            segundo_talher = self.talher_direito
        else:
            # Filósofos ímpares pegam primeiro o talher direito
            primeiro_talher = self.talher_direito
            segundo_talher = self.talher_esquerdo 
```

## Executar o código e descrever comportamento observado

Ao executar o código, foi possível observar que o programa roda sem travamentos. Pelo terminal, dá pra ver que filósofos que não são vizinhos conseguem comer ao mesmo tempo, enquanto os vizinhos aguardam a liberação dos talheres.

[![result.png](https://i.postimg.cc/qvrCZzQt/result.png)]

## Considerações Finais

Com essa implementação foi possível entender na prática como funciona a execução concorrente com múltiplas threads e recursos compartilhados. O uso de locks garantiu que os talheres fossem usados corretamente, evitando conflitos, e a estratégia de alternar a ordem de aquisição dos recursos funcionou bem para prevenir deadlocks, permitindo que todos os filósofos concluíssem suas refeições sem problemas.