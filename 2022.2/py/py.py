n = int(input())
k = int(input())

pontuacoes = []

for _ in range(n):
    pont = int(input())
    pontuacoes.append(pont)

pontuacoes.sort(reverse = True)
corte = pontuacoes[k - 1]

cla = sum(1 for pont in pontuacoes if pont >= corte)

print(cla)