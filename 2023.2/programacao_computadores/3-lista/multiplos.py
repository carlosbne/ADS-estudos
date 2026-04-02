"""-----------PROBLEMA------------- 
Escreva um programa que leia 2 números inteiros e informe se o maior é múltiplo do menor.

---------------Input---------------
A entrada é composta de dois números inteiros a eb (1 ≤ a, b ≤ 109), cada um em uma linha.

---------------Output--------------
A saída deve conter uma única linha com o texto "Multiplos" caso o maior seja múltiplo do menor ou "Nao multiplos" caso contrário. Observe que não há acentos no texto. """


n1 = int(input())
n2 = int(input())

maior = n1
menor = n2
if (n2 > maior):
    maior = n2
    menor = n1

if maior % menor == 0:
    print('Multiplos')
else:
    print('Nao multiplos')