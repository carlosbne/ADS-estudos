.text
main:   addi $2, $0, 5
	syscall 		#le um inteiro
	add $8, $0, $2		#$08 recebe valor lido
	mul $9, $8, $8	
	mflo $4
	addi $2, $0, 1
	syscall 		#imprime o inteiro.
fim:	addi $2, $0, 10  	#fecha
