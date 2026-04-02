.text
main:	addi $2, $0, 5
	syscall
	
	slt $8, $2, $0		#se ($2 < 0) então $8 = 1 senao $8 = 0
	beq $8, $0, positivo
	
	mul $4, $2, $2
	j print


positivo: add $4, $2, $2
	  j print
	  
print:  addi $2, $0, 1
	syscall
	
fim: 	addi $2, $0, 10