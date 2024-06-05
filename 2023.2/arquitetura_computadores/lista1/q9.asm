.text

main:	addi $2, $0, 5
	syscall
	addi $8, $2, 0
	
	#---
	addi $11, $0, 3600
	addi $12, $0, 60
	
	div $8, $11
	mflo $15
	
	div $8, $11
	mfhi $14
	div $14, $12
	mflo $16
	
	div $8, $12
	mfhi $17
	
	
print:	add $4, $0, $15
	addi $2, $0, 1
	syscall			#print unidade
	
	addi $4, $0, ':'		
	addi $2, $0, 11
	syscall	
	
	add $4, $0, $16
	addi $2, $0, 1
	syscall			#print dezena
	
	
	addi $4, $0, ':'		
	addi $2, $0, 11
	syscall	
	
	add $4, $0, $17		
	addi $2, $0, 1
	syscall			#print centena
	
fim: 	addi $2, $0, 10
	syscall
	