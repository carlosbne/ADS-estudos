""" -----------PROBLEMA-------------
Escreva um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, seu programa deve calcular e informar o total a receber no final do mês.

----------------Input----------------
A entrada é composta de 3 linhas. A primeira linha contém o nome do vendedor, formada apenas por letras maiúsculas e minúsculas, sem acentos e sem espaços. A segunda linha contém um real S, o salário base do vendedor (0.01 ≤ S ≤ 5000.00) e a terceira linha contém um número real V (0.00 ≤ 50000.00), o total de vendas do vendedor no mês.

----------------Output---------------
Seu programa deve mostras duas linhas. A primeira linha contém o nome do vendedor e a segunda linha contém o total de vendas no formato R$ XXX.XX, com exatas 2 casas decimais. """



nomeVendedor = input()
salarioBase = float(input())
totalVendas = float(input())

bonus = totalVendas * 0.15

salarioTotal = salarioBase + bonus

print(nomeVendedor)
print(f'R$ {salarioTotal:.2f}')