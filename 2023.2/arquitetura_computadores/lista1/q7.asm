.text

main:	addi $2, $0, 5
	syscall
	add $8, $0, $2 		 # $8 = num
	
	addi $19, $0, 1000	#const 1000
	addi $20, $0, 100	#const 100
	addi $21, $0, 10	#const 10
	
	div $8, $19
	mflo $13
	
	div $8, $20
	mflo $14
	div $14, $21
	mfhi $9			# $9 = num / 100
	
	
	div $8, $21	
	mflo $10
	div $10, $21
	mfhi $11 		# $11 = num / 10 % 10
	
	div $8, $21
	mfhi $12		# $12 = num % 10
	
	
	
print:	
	add $4, $0, $12
	addi $2, $0, 1
	syscall			#print unidade
	
	addi $4, $0, '\n'		
	addi $2, $0, 11
	syscall	
	
	add $4, $0, $11
	addi $2, $0, 1
	syscall			#print dezena
	
	
	addi $4, $0, '\n'		
	addi $2, $0, 11
	syscall	
	
	add $4, $0, $9		
	addi $2, $0, 1
	syscall			#print centena
	
	addi $4, $0, '\n'		
	addi $2, $0, 11
	syscall	
	
	
	add $4, $0, $13		
	addi $2, $0, 1
	syscall			#print milhar
	
	
fim:	addi $2, $0, 10
	syscall