"""----------PROBLEMA--------- 
Para se preparar para os outros problemas, vamos fazer um teste. Dado um número X, retorne o menor número par maior do que X.

-------------Input-------------
Uma linha contendo um número x (0 < x < 107).

-------------Output-----------
Uma linha contendo a resposta do problema. """

n1 = int(input())
 
if n1 % 2 == 0:
    a = n1 + 2
    print(a)
else: 
    a = n1 + 1
    print(a)