"""----------PRBLEMA----------
 Escreva um programa que leia um número inteiro e informe se o mesmo é par ou ímpar.

------------Input-----------
A entrada é composta de uma única linha com um número inteiro n (1 ≤ n ≤ 1013)

------------Output-------------
Seu programa deve mostrar, em uma única linha, a palavra 'Par' ou a palavra 'Impar'. """

n1 = int(input())
 
if n1 % 2 == 0:
    print('Par')
else: 
    print('Impar')