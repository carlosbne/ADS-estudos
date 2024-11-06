# exemplo aula02 -> descobrir que um número par

.text
main:	addi $8, $0, 5	
	addi $9, $0, 2
	div  $8, $9
	mfhi $10	# se for par = 0 : 1
	
	
outro: 	addi $8, $0, 5	
	andi $9, $0, 1	# se último bit for 1 = impar, se for 0 = par


# exemplo 2 -> calcular media do aluno
.text
main:	addi $8, $0, 55
	addi $9, $0, 70
	addi $10, $0, 2
	addi $11, $0, 3
	
	mul $12, $8, $10
	mul $13, $9, $11
	add $14, $12, $13
	
	addi $15, $0, 5
	div $14, $15
	mflo $16 
	
# outra forma de resolver
main:	addi $8, $0, 55
	addi $9, $0, 70
	sll $10, $8, 1	# = mul por 2
	sll $11, $9, 1	# = mul por 2
	add $11, $11, $9 # mul por 2 + ele
	add $12, $10, $11 # soma notas
	
	
	addi $15, $0, 5
	div $12, $13
	mflo $16 