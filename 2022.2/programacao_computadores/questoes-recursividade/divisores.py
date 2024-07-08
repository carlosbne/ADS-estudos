def conta_divisores_r(n, d):
    if (d == 1):
        return 1
    qtd = conta_divisores_r(n, d-1)
    if (n % d == 0):
        qtd = qtd + 1
    return qtd



def conta_divisores(n):
    return (conta_divisores_r(n, n))  


n = int(input())
divisores = conta_divisores(n)
print("O número {:d} tem {:d} divisores.".format(n, divisores))