
linhas = int(input())
colunas = int(input())

if (linhas % 2 == 0) and (colunas % 2 == 0):
    print(1)
else:
    if (linhas % 2 == 0) and (colunas % 2 != 0):
        print(0)
    else:
        if (linhas % 2 != 0) and (colunas % 2 == 0):
            print(0)
        else:
            if (linhas % 2 != 0) and (colunas % 2 != 0):
                print(1)
