# Aula 01 - Classes e Endereçamentos de IP

### Aula 01 - Classes e Endereçamentos de IP

Endereço IP (Internet Protocol)

Os endereços IPs constituem recursos que podem ser utilizados para a identificação de computadores que acessam à rede. Em resumo, é uma identificação lógica dado a computadores e dispositivos na rede. O ip é formado por 4 números separados por pontos: 

Ex.: 192.168.0.1

Cada número é chamado de octeto.

Ex.: 

Decimal: 192.168.0.1  → Classe C

Binário: 11000000 . 10101000 . 00000000 . 00000001

Classes IPs

As classes foram criadas para facilitar e organizar a distribuir os ips.

Sendo elas: A, B, C, D e E. Separadas por intervalos numéricos.

| CLASSES | INTERVALO |
| --- | --- |
| A | 0 a 127 - 128 |
| B | 128 a 191 - 64 |
| C | 192 a 223 - 32 |
| D | 224 a 239 - 16 |
| E | 240 a 255 - 16 |

Classes A, B, C são utilizadas pela internet, ou seja, ao se conectar a internet o dispositivo recebe um ip de alguma dessas classes.

- Os IPs só podem utilizar valores entre 0 e 255;
- Nenhum IP começa com 0;
- A rede 127 (local host) é um endereço de retorno (Loopback);
- As classes D e E são utilizadas para Multicast e testes de novas tecnologias.

### Aula 02 - Tipos de comunicação e Endereço MAC

Comunicações: 

- Unicast → É a mensagem enviada para um único host;
- Multicast → É a mensagem enviada para um grupo de hosts da rede (grupo de computadores).
- Broadcast → É a mensagem enviada para todos os hosts de uma rede;
- Anycast → É a mensagem enviada para qualquer host mais próximo.

Endereço MAC (Media Access Control):

É a identificação física da placa responsável por fazer a comunicação do computador ou dispositivo com a rede.

Ex.:  FF:E3:45:FE:80:2C   |  → Empresa → Dispositivo

### Tecnologias de Conexão com a Internet

Formas de Comunicação:

- Linha Telefônica