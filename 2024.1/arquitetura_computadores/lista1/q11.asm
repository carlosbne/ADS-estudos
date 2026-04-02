.text

main:	addi $2, $0, 5
	syscall
	add  $8, $2, $0
	
	addi $20, $0, 100		#const 100
	addi $21, $0, 10		#const 10
	
	div  $8, $20
	mflo $10			#pega centena
	
	div  $8, $21
	mflo $9
	div  $9, $21
	mfhi $11			#pega dezena
	
	div  $8, $21
	mfhi $12			#pega unidade
	
print:	addi $4, $12, 0
	addi $2, $0, 1
	syscall				#printa unidade
	
	addi $4, $11, 0
	addi $2, $0, 1
	syscall				#printa dezena
	
	addi $4, $10, 0
	addi $2, $0, 1
	syscall				#printa centena