def eh_primo_recursivo(n, divisor=2):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % divisor == 0:
        return False
    if divisor * divisor > n:
        return True
    return eh_primo_recursivo(n, divisor + 1)

def eh_primo(n):
    return eh_primo_recursivo(n)

num = int(input("Digite um número inteiro positivo: "))
resultado = eh_primo(num)

if resultado:
    print("{} é primo.".format(num))
else:
    print("{} não é primo.".format(num))
