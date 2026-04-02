""" --------PROBLEMA----------
Escreva um programa que leia dois valores L1 e L2, que representam os lados de um retângulo e mostre o perímetro do mesmo.

--------Input----------
Uma única linha com dois valores inteiros L1 e L2 (1 ≤ L1, L2 ≤ 109).

--------Output---------
Um único inteiro com o perímetro do retângulo. """

lado1, lado2 = list(map(int, input().split()))

perimetro = 2*(lado1 + lado2)

print(perimetro)