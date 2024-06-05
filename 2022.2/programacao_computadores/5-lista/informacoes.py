a, b = map(int, input().split())

if a >= b:
    if a % b == 0:
        print(a, "é multiplo de" , b)
    else: 
        print(a, "não é multiplo de" , b)
else:
    if b % a == 0:
        print(b, "é multiplo de" , a)
    else: 
        print(b, "não é multiplo de" , a)