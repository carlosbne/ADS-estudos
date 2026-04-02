.text

main:	addi $2, $0, 5
	syscall
	add $8, $0, $2 		 # $8 = nota1
	
	addi $2, $0, 5
	syscall
	add $9, $0, $2 		# $9 = nota2
	
	addi $11, $0, 2		#cont 2
			
	add $10, $8, $9		# $4 = num1 + num2
	div $10, $11
	mflo $4
	
print:	
	addi $2, $0, 1
	syscall
	
	addi $2, $0, 10
	syscall