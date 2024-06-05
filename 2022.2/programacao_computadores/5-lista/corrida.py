numCharrete1, distancia1, velocidade1 = map(int, input().split())
numCharrete2, distancia2, velocidade2 = map(int, input().split())

i_charrete1 = 0
while True:
    total1 = distancia1 - velocidade1
    
    i_charrete1 += 1
    if total1 <= 0:
        break

i_charrete2 = 0
while True:
    total2 = distancia2 - velocidade2
    i_charrete2 += 1
    if total2 <= 0:
        break

if(i_charrete1 < i_charrete2):
    print(numCharrete1)
else:
    print(numCharrete2)