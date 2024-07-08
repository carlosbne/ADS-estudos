def divisores_r(n, d):
    if (d == 1):
        return [1]
    lista_divisores = divisores_r(n, d-1)
    if (n % d == 0):
        lista_divisores.append(d)
    return lista_divisores



def divisores(n):
    return (divisores_r(n, n))  


n = int(input())
divs = divisores(n)
print("Divisores de {:d}: ".format(n), end=" ")
print(divs)