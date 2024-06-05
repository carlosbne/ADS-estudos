num1 = int(input())
num2 = int(input())
num3 = int(input())

par1 = 0
par2 = 0
par3 = 0

impar1 = 0
impar2 = 0
impar3 = 0

if(num1 % 2 == 0):
    par1 = num1
else:
    impar1 = num1 

if(num2 % 2 == 0):
    par2 = num2
else:
    impar2 = num2 

if(num3 % 2 == 0):
    par3 = num3
else:
    impar3 = num3 

maiorPar = par1
if(par1 != 0 or par2 != 0 or par3 != 0 ):
    if(maiorPar < par2):
        maiorPar = par2
    if(maiorPar < par3):
        maiorPar = par3
else:
    print('impossível realizar a operação')

menorImpar = impar1       
if(impar1 != 0 or impar2 != 0 or impar3 != 0):
    if(menorImpar < impar2):
        menorImpar = impar2
    if(menorImpar < impar3):
        menorImpar = impar3
else:
    print('impossível realizar a operação')

if(maiorPar != 0 and menorImpar != 0):
    print(maiorPar)
    print(menorImpar)