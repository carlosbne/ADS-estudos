.text
main:	addi $2, $0, 5		#ler primeiro
	syscall
	add $8, $0, $2
	addi $2, $0, 5		#ler segundo
	syscall
	add $9, $0, $2
	addi $2, $0, 5		#ler terceiro
	syscall
	add $10, $0, $2
	
	sll $9, $9, 1		#desloca para esquerda é o mesmo que mult por 2
	
	sll $11, $10, 1
	add $10, $11, $10	#desloca uma vez e soma por ele = mult por 3
	
	add $12, $8, $9
	add $12, $12, $10
	
	addi $13, $0, 6
	div  $12, $13
	
	mflo $14
	mflo $4
	addi $2, $0, 1
	syscall
	
	addi $13, $0, 60
	slt $15, $14, $13	# $15 = $14 < $13 ? 1 : 0
	
	beq $15, $0, apv
	addi $4, $0, 'R'
	j imp

apv:	addi $4, $0, 'A'
	j imp
imp:	addi $2, $0, 11
	syscall
	
fim: 	addi $2, $0, 10
	syscall