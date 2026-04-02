def exp(a, b):
    if(b == 0):
        return 1
    else:
        return a*exp(a, b-1)


a, b = map(int, input().split())
x = exp(a, b)
print("{:d}**{:d} = {:d}".format(a, b, x))