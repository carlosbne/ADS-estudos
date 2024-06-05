.text
 main: 	lui $8, 0x1001
 	addi $9, $0, 6
 	addi $10, $0, 0
 	
cont: 	beq $10, $9, fimLer
 	
 	addi $2, $0, 5
 	syscall
 	sw $2, 0($8)
 	
 	addi $8, $8, 4
 	addi $10, $10, 1
 	j cont
 	
fimLer:	addi $10, $0, 0	
 	addi $8, $8, -4
 	 	
print: beq $10, $9, fim
 	
 	lw $4, 0($8)
 	addi $2, $0, 1
 	syscall
 	addi $4, $0, ' '
        addi $2, $0, 11
        syscall
 	
 	addi $8, $8, -4
 	addi $10, $10, 1
 	j print
 	
 fim:	addi $2, $0, 10
 	syscall
 	