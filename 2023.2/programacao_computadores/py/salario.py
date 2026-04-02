nome = input()
horasTrabalhadas = int(input())
valor = float(input())

salario = horasTrabalhadas * valor

print(nome)
print("R$ {:.2f}".format(salario))