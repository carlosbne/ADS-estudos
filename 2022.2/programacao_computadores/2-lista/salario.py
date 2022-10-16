""" ----------PROBLEMA----------
Escreva um programa que leia o nome de um funcionário, o número de horas trabalhadas, o valor da hora de trabalho e calcule o salário desse funcionário. O programa deve mostrar o total do salário do funcionário.

-------------Input-------------
A entrada é composta de 3 linhas. A primeira contém o nome do funcionário, sem espaços, com, no máximo 20 letras. A segunda linha contém um inteiro que representa o total de horas trabalhadas H (1 ≤ H ≤ 160). A terceira linha contém um valor real V (0.01 ≤ V ≤ 500.00) com o valor a ser pago por hora de trabalho.

-------------Output------------
A saída deve conter 2 linhas, a primeira com o nome do funcionário e a segunda com o salário no formato R$ XXX.XX, com 2 casas decimais. """

nomeFuncionario = input()
totalHoraTrabalhada = int(input())
valorHoraTrabalhada = float(input())

salario = totalHoraTrabalhada * valorHoraTrabalhada

print(nomeFuncionario)
print(f'R$ {salario:.2f}')

