""" --------------PROBLEMA-------------
 Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

-------------Input-------------
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

-------------Output------------
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: "Presentation Error". """

valor = int(input())

div100 = valor//100
rest100 = valor%100

div50 = rest100//50
rest50 = rest100%50

div20 = rest50//20
rest20 = rest50%20

div10 = rest20//10
rest10 = rest20%10

div5 = rest10//5
rest5 = rest10%5

div2 = rest5//2
rest2 = rest5%2

div1 = rest2//1
rest1 = rest2%1

print(valor)
print(f'{div100} nota(s) de R$ 100,00')
print(f'{div50} nota(s) de R$ 50,00')
print(f'{div20} nota(s) de R$ 20,00')
print(f'{div10} nota(s) de R$ 10,00')
print(f'{div5} nota(s) de R$ 5,00')
print(f'{div2} nota(s) de R$ 2,00')
print(f'{div1} nota(s) de R$ 1,00')