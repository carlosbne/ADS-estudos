#Q1) Faça um programa para ler dois números e informe qual deles é o maior.

.text
main:	addi $2, $0, 5
	syscall
	add $8, $0, $2
	addi $2, $0, 5
	syscall
	add $9, $0, $2
	
	slt $10, $8, $9		# $10 = ($8 < $9) ? 1 : 0
	beq $10, $0, priMaior	# $10 == 0 ? $8 == maior : $9 maior
	add $4, $0, $9
	j imprimir
	

priMaior: add $4, $0, $8
	  j imprimir

imprimir: addi $2, $0, 1
	  syscall	

fim:	addi $2, $0, 10
	syscall

#Q2) Faça um programa para ler um número inteiro. Se o número for positivo, imprima o
#dobro do número, se for negativo, imprima o quadrado do número.

.text
main:	addi $2, $0, 5
	syscall
	add $8, $0, $2
	addi $9, $0, 2
	
	slt $10, $8, $0		# $10 = ($8 < $0) ? 1 : 0
	beq $10, $0, posi	# $10 == 0 ? $8 == maior : $9 maior
	mul $20, $8, $8
	add $4, $0, $20
	j imprimir
	

posi: 	mul $21, $8, $9
	add $4, $0, $21
	  j imprimir

imprimir: addi $2, $0, 1
	  syscall	

fim:	addi $2, $0, 10
	syscall
	

#Q3) Escreva um programa para ler dois números inteiros e mostrar na tela o maior deles,
#bem como a diferença entre eles (a diferença é sempre um valor positivo)

.text
main:	addi $2, $0, 5
	syscall
	add $8, $0, $2
	addi $2, $0, 5
	syscall
	add $9, $0, $2
	
	slt $10, $8, $9		# $10 = ($8 < $9) ? 1 : 0
	beq $10, $0, maior	# $10 == 0 ? $8 == maior : $9 maior
	sub $20, $9, $8
	add $4, $0, $20
	j imprimir
	

maior: 	sub $21, $8, $9
	add $4, $0, $21
	  j imprimir

imprimir: addi $2, $0, 1
	  syscall	

fim:	addi $2, $0, 10
	syscall
	
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