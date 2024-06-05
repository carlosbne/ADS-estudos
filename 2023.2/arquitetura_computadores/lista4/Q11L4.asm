.text
main: 	addi $2, $0, 5
	syscall
	add $4, $0, $2
	addi $2, $0, 5
	syscall
	add $5, $0, $2
	jal expo
print:	add $4, $0, $2
	addi $2, $0, 1
	syscall
fim:	addi $2, $0, 10
	syscall

# Rotina retorna X^Z
# Entradas: $4, $5
# Saida: $2
# usa: $10, $11
expo:	add $10, $0, $4
	add $11, $0, $5
	addi $12, $0, 1
mltp:	mul $12, $12, $10
	addi $11, $11, -1
	bne $11, $0, mltp
	addi $2, $12, 0
	jr $31
