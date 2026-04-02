cibele = int(input())
celeste = int(input())
camila = int(input())
 
if (cibele >= celeste and cibele <= camila or cibele >= camila and cibele <= celeste):
    print(cibele)
elif(celeste >= camila and celeste <= cibele or celeste <= camila and celeste >= cibele):
    print(celeste)
elif(camila >= celeste and camila <= cibele or camila <= celeste and camila >= cibele):
    print(camila)
