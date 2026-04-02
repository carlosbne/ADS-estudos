def e_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True
 
def menor_primo_maior_que_n(n):
    numero = n + 1
    while not e_primo(numero):
        numero += 1
    return numero
 
n = int(input())
 
resultado = menor_primo_maior_que_n(n)
print(resultado)