""" ----------------PROBLEMA----------------- 
Você foi contactado para escrever um programa que calcule a média ponderada entre dois números inteiros v1 e v2. A média ponderada mp é calculada através da fórmula a seguir:


onde p1 é o peso de v1 e p2 é o peso de v2.

-----------------Input------------------
A entrada e composta de duas linhas. A primeira linha contém 2 (dois) números inteiros v1 e v2 (1 ≤  v1, v2 ≤ 109), separados por um espaço. A segunda linha contém também dois números inteiros p1 e p2 (1 ≤  v1, v2 ≤ 103), também separados por um espaço.

------------------Output------------------
A saída deve ter apenas um número inteiro com o valor da média ponderada, desprezando-se as casas decimais. """

valor1, valor2 = map(int, input().split())
peso1, peso2 = map(int, input().split())

media = ((valor1 * peso1) + (valor2 * peso2)) / (peso1 + peso2)

print(int(media))

