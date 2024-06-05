def primo_r(n, d):
    if (d == 1):
        return 1
    qnt_div = 0
    if (n % d == 0 and ((n // d == n or d) or (n // d == 1))):
        qnt_div = qnt_div + 1
    if (qnt_div == 2):
        return True
    return qnt_div + primo_r(n, d-1)

def primo(n):
    return primo_r(n, n)


num = int(input())
resultado = primo(num)
print("{:d} é = {} portanto {:d} é Primo".format(num, resultado, num))