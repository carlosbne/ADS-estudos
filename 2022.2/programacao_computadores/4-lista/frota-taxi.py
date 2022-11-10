alcool, gasolina, rA, rG = map(float, input().split())

totalAlcool = alcool/rA
totalGasolina = gasolina/rG

if totalAlcool < totalGasolina:
    print('A')
else:
    print('G')