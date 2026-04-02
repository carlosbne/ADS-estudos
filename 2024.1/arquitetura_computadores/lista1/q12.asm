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
	addi $18, $0, 3
	addi $19, $0, 9
	addi $20, $0, 15	
	
# --- cont
	# num1 * 3
	add  $11, $8, $8		
	add  $11, $11, $8		
	
	#num2 * 9
	add  $12, $9, $9		
	add  $12, $12, $9
	add  $12, $12, $9
	add  $12, $12, $9
	add  $12, $12, $9
	add  $12, $12, $9
	add  $12, $12, $9
	add  $12, $12, $9
	
	#num3 * 15
	add  $13, $10, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	add  $13, $13, $10
	
	
	# soma dos pesos
	add  $18, $18, $19
	add  $20, $18, $20
	
	# soma das mult
	add  $13, $13, $12
	add  $13, $13, $11
	
	#div
	div  $13, $20
	mflo $21
	

print:  add  $4, $0, $21
	addi $2, $0, 1
	syscall
	
	addi $2, $0, 10
	syscall