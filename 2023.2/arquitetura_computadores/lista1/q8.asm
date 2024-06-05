.text

main:	addi $2, $0, 5
	syscall
	addi $8, $2, 0
	
	addi $2, $0, 5
	syscall
	addi $9, $2, 0
	
	addi $2, $0, 5
	syscall
	addi $10, $2, 0
	
	#---
	addi $11, $0, 3600
	addi $12, $0, 60
	
	mul $19, $8, $11
	mul $20, $9, $12
	
	add $4, $19, $20
	add $4, $4, $10
	
print:	addi $2, $0, 1
	syscall
	
fim: 	addi $2, $0, 10
	syscall
	