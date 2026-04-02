# exemplo aula04 -> ler um número e informar se é par ou impar

.text
main:	addi $2, $0, 5
	syscall			# le um inteiro para $2
	andi $8, $2, 1		# $8 = o bit menos significativo de $2
	beq $8, $0, par		# se $8 == 0 salta para par
	addi $4, $0, 'i'	# coloca o 'i' em $4
	j print			# para para impressão
par:	addi $4, $0, 'p'	# coloca o 'p' em $4
print:	addi $2, $0, 11		# impressão de char
	syscall

fim:	addi $2, $0, 10
	syscall