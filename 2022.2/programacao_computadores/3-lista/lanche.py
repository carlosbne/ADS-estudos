"""-----------PROBLEMA----------- 
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

        Código	Produto	         Preço
        1	    Cachorro-quente	 R$ 4,00
        2	    X-salada	     R$ 4,50
        3	    X-Bacon	         R$ 5,00
        4	    Torrada simples	 R$ 2,00
        5	    Refrigerante	 R$ 1,50

--------------Input----------------
A entrada contém dois valores inteiros c (1 ≤ c ≤ 5) e q (1 ≤ q ≤ 100), correspondentes ao código e à quantidade de um item conforme tabela acima.

--------------Output---------------
A saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. """

codigo, valor = map(float, input().split())
 
p1 = 4
p2 = 4.5
p3 = 5
p4 = 2
p5 = 1.5
 
if codigo == 1:
    total = p1 * valor
else:
    if codigo == 2:
        total = p2 * valor
    else:
        if codigo == 3:
            total = p3 * valor
        else:
            if codigo == 4:
                total = p4 * valor
            else:
                if codigo == 5:
                    total = p5 * valor
 
print(f'Total: R$ {total:.2f}')