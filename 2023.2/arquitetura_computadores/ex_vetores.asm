.data
 .word 12 15 8 0 3

.text
main:   lui $4, 0x1001
	addi $5, $0, 3
	jal prn
fim:	addi $2, $0, 10
	syscall

prn:	add $9, $0, $4		# $9 = end. inicial
	add $10, $0, $5		# $10, = qtd. que resta imprimir

cont:	lw  $4, 0($9)		# $4 = MEM[$9]
	addi $2, $0, 1
	syscall			# imprime $4
	addi $2, $0, 11
	addi $4, $0, '\n'
	syscall	
	addi $9, $9, 4		# próximo endereço
	addi $10, $10, -1	# restam a imprimir
	bne  $10, $0, cont	# se resta algum, volta para cont
fimprn: jr $31			# Fim da rotina