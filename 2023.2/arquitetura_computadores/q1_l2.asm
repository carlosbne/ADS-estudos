.text
main:	addi $2, $0, 5	
        syscall
	add $8, $2, 0		#8 = n1
	addi $2, $0, 5
	syscall
	add $9, $2, $0		#$9 = n2
	addi $10, $0, 1		#const  
	
	slt $11, $8, $9		#se (n1 < n2) então $11 = 1 senao $11 = 0
	beq $11, $10, maior	#se $11 = 1 então pula p maior, senão 
	
	add $4, $8, $0 
	j print
	
maior:  add $4, $9, $0		#$4 = n2 
	j print
	
print:  addi $2, $0, 1
	syscall
	
fim:    addi $2, $0, 10
	syscall

