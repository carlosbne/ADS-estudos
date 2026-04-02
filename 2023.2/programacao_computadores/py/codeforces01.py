numero = int(input())
tutu = 10
ji = tutu*tutu

c = (numero // ji) % tutu
d = (numero // tutu) % tutu
u = numero % tutu

if(c <100):
    c = 0

print(f'c= {c}, d= {d}, u= {u}')

soma = c+d+u

print(soma)