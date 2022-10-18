distancia = int(input())
velocidade = int(input())

tempo = distancia / velocidade

tempo = tempo * 3600
hora = tempo / 3600
restoHora = tempo % 3600
minuto = restoHora / 60

print("%02d:%02d" % (hora, minuto))