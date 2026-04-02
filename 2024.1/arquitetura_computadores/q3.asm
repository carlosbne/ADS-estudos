#Q7) Faça um programa que leia um ano e informe se esse ano é bissexto.

.text
main:	addi $2, $0, 5
	syscall
	add $8, $0, $2
	addi $10, $0, 100
	addi $11, $0, 4
	addi $12, $0, 400
	
	#divisivel por 4?
	div $8, $11
	mfhi $13
	beq $13, $0, teste2		# se $13 == 0 -> teste2
	j naoBi

teste2:	div $8, $10
	mfhi $14
	beq $14, $0, teste3		# se $14 == 0 -> teste2
	j eBi

teste3: div $8, $12
	mfhi $15
	beq $15, $0, eBi		# se $15 == 0 -> teste2
	j naoBi
	
eBi:	add $4, $0, 'B'
	j imprimir
	
naoBi:	add $4, $0, 'N'
	j imprimir

imprimir: addi $2, $0, 11
	  syscall	

fim:	addi $2, $0, 10
	syscall