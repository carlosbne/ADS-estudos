def fat(n):
    res = 1
    if(n > 0):
        res = n * fat(n-1)
    return res


n = int(input())
x = fat(n)
print("Fatorial de {:d} = {:d}".format(n,x))