#Q1-L04
.text
main:	addi $2, $0, 5
	syscall
	add  $4, $0, $2
	jal dobro
print:	add $4, $0, $2
	addi $2, $0, 1
	syscall
	addi $2, $0, 10
	syscall


# rotina que retorna o dobro do número
# entrada: $4
# saida: $2
dobro:	sll $2, $4, 1
	jr $31