.text 
main:	lui $8, 0x1001
	addi $9, $0, 8
	addi $10, $0, 0

ler:	beq $10, $9, ler2

	addi $2, $0, 5
	syscall
	sw $2, 0($8)
	
	addi $8, $8, 4
	addi $10, $10, 1
	j ler

ler2:	addi $2, $0, 5
	syscall
	add $20, $2, $0
	sll $20, $20, 2
	add $20, $20, $8
	lw  $20, 0($8) 
	
	addi $2, $0, 5
	syscall
	add $21, $2, $0	
	
som:	add $8, $0, $20
	lw  $15, 0($8)
	
	add $8, $0, $21
	lw $16, 0($8)
	
	add $4, $15, $16
	addi $2, $0, 1
	syscall

	addi $2, $0, 10
	syscall
	
	 