.text

main:	addi $2, $0, 5
	syscall
	add $8, $0, $2 		 # $8 = num1
	
	addi $2, $0, 5
	syscall
	add $9, $0, $2 		# $9 = num2
	
	mul $4, $8, $9		# $4 = num1 * num2
	
print:	
	addi $2, $0, 1
	syscall
	
	addi $2, $0, 10
	syscall