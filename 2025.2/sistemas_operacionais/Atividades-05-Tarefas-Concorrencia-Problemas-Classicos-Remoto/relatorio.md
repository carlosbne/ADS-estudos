# Problema do Leitor / Escritor – Estacionamento Concorrente

### Contexto inicial do trabalho (introdução)

O Problema dos Leitores/Escritores é um exemplo clássico de concorrência em Sistemas Operacionais, que trata do acesso simultâneo a um recurso compartilhado. Neste trabalho, esse problema é simulado por meio de um estacionamento com 10 vagas, onde múltiplos clientes tentam consultar, ocupar e liberar vagas de forma concorrente.

O principal desafio é garantir que as leituras possam ocorrer sem problemas, mas também que operações de escrita — como ocupar ou liberar uma vaga — sejam feitas de forma segura, evitando condições de corrida e inconsistência dos dados.

### Descrevendo a solução em Python para o problema de leitor / escritor

A solução foi implementada em Python utilizando Sockets TCP para comunicação cliente-servidor e Threads para simular múltiplos clientes acessando o estacionamento ao mesmo tempo. O servidor mantém o controle das vagas disponíveis, enquanto os clientes realizam operações de consulta (leitura) e alteração do estado das vagas (escrita).

Para garantir a consistência dos dados, o acesso ao contador de vagas é protegido por um Lock, assegurando exclusão mútua nas operações críticas.

---
### Implementando o servidor e cliente
#### Qual o algoritmo utilizado

O algoritmo utiliza o modelo cliente-servidor com comunicação via sockets. No servidor, cada conexão é tratada por uma thread independente. O controle das vagas é feito por uma variável global protegida por um ``threading.Lock``, garantindo que apenas uma thread por vez possa alterar o número de vagas disponíveis.

As consultas de vagas atuam como operações de leitura, enquanto os comandos de pegar e liberar vaga atuam como operações de escrita.

---

### Tratando impasse
#### Qual a estratégia de tratamento de impasses

O principal risco neste problema é a condição de corrida, onde dois clientes poderiam tentar ocupar a mesma vaga ao mesmo tempo. Para evitar isso, foi utilizada a estratégia de Exclusão Mútua, protegendo o acesso ao recurso compartilhado com um Lock.

Como todas as operações críticas utilizam o mesmo Lock e não há aquisição múltipla de recursos, o sistema também evita situações de deadlock.

---
#### Implementação do tratamento de impasse em Python
No servidor, o tratamento é feito utilizando um objeto ``threading.Lock()``. Sempre que uma thread precisa consultar ou alterar o número de vagas, ela entra em uma seção crítica protegida pelo Lock:

```python
with lock:
    if vagas_disponiveis > 0:
        vagas_disponiveis -= 1
```
Esse mecanismo garante que as operações sejam atômicas e que o estado do estacionamento permaneça consistente.

### Executar o código e descrever comportamento observado 
Ao executar o sistema com 50 clientes simultâneos, observou-se que o programa funciona sem travamentos. Apenas os primeiros clientes conseguem ocupar as 10 vagas disponíveis, enquanto os demais aguardam até que alguma vaga seja liberada.

![outro.png](https://i.postimg.cc/KzymsXrn/outro.png)

Assim que um cliente libera a vaga, outro consegue ocupá-la, mostrando que o controle concorrente está funcionando corretamente. Em nenhum momento o número de vagas ficou negativo ou inconsistente.

### Considerações finais

A implementação demonstrou de forma prática como gerenciar recursos compartilhados em um ambiente concorrente utilizando sockets e threads. O uso de Sockets permite a comunicação, enquanto os Locks evita condições de corrida - garantindo a consistência dos dados. Dessa forma mostra como o problema dos Leitores/Escritores pode ser tratado em um cenário cliente-servidor.