def fatorial(n):
    if(n == 0):
        return 1
    return n*fatorial(n-1)




x = int(input())
f = fatorial(x)
print("{:d}! = {:d}".format(x, f))