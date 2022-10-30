consumo = int(input())
distancia = int(input())
tanque = int(input())

quantidade = (distancia/consumo) - tanque

if quantidade <= 0:
    quantidade = 0.0

print(f'{quantidade:.1f}')