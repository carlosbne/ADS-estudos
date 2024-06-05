""" Escreva um programa que leia 2 numeros inteiros e mostre se o menor é dividor do maior. """
num1 = int(input())
num2 = int(input())

maior = num1
menor = num2
if(maior < menor):
    maior = num2
    menor = num1

if(maior % menor == 0):
    print(f'O {menor} é divisor do {maior}')
else:
    print(f'O {menor} não é divisor do {maior}')