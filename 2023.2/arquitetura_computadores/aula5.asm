# laço com teste no inicio
.text
main:	addi $9, $0, 4		#add constante 4
	add $8, $0, $0		# $8 = num

loop:	beq $8, $9, sai		#se $8 = 4 sai
	
	
	
	addi $8, $8, 1
	j loop
	
sai:	


# laço com teste no fim
.text
main:	addi $9, $0, 10
	add $8, $0, $0
cont:	
	
	
	addi $8, $8, 1		# i = i + 1
	bne $8, $9, cont	# se i != 10 cont
	
sai: 