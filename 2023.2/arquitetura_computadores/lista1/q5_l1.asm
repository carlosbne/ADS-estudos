.text 
main:	addi $2, $0, 5
	syscall				#le um inteiro
	
	add $8, $2, $0
	addi $9, $0, 10
mltp:	mul $10, $9, $9
	div $8, $10
	mflo $12			#$12 ← resto da div C
	div $8, $9
	mflo $13			#$13 ← recebe quociente D
	div $13, $9			
	mfhi $14			#$14 <- recebe resto de quoc/10
	div $8, $9
	mfhi $15			#$15 <- resto de $8/10
	
	add $4, $12, $0
	add $4, $14, $4
	add $4, $15, $4
	
	addi $2, $0, 1
	syscall
	
fim:	addi $2, $0, 10
	
