""" a função f(x, y) calcula a média dos valores de x e y após um número indeterminado de chamadas recursivas, onde x e y são atualizados de acordo com as regras estabelecidas. O valor retornado será a média quando x for maior ou igual a y. """

def f(x,y):
    if (x>=y):
        return (x+y)/2
    else:
        return f(f(x+2,y-1),f(x+1,y-2))
                
print(f(1,8))