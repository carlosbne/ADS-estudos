.text
main:	addi $2, $0, 5		#ler primeiro
	syscall
	add $8, $0, $2
	addi $2, $0, 5		#ler segundo
	syscall
	add $9, $0, $2
	
	add $4, $0, $8
	addi $2, $0, 1
	syscall
	
	beq $8, $9, impIgual	#se forem iguais, pula para imprimir igual
	slt $10, $8, $9 	# $10 = $8<$9 ? 1 : 0;
	beq $10, $0, impMaior 	#se $10 == 0, pula para imprimir maior
	addi $4, $0, '<'
	   j imp	   
impMaior: addi $4, $0, '>'
	   j imp
impIgual: addi $4, $0, '='
	   j imp
	  
imp: 	addi $2, $0, 11
	syscall
	  
	add $4, $0, $9
	addi $2, $0, 1
	syscall
	
	addi $4, $0, '\n'
        addi $2, $0, 11
        syscall

fim: 	addi $2, $0, 10
	syscall