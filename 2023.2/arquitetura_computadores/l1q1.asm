.text
# Q1) Faça um programa para ler um número inteiro e imprimir o dobro desse número.
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	
	sll $4, $8, 1

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall
	
#Q2) Faça um programa para ler um número inteiro e imprimir o quadrado desse número.
.text
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	
	mul $4, $8, $8

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall

#Q3) Faça um programa para ler dois números inteiros e imprimir a multiplicação desses
#dois números
.text
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	
	addi $2, $0, 5
	syscall
	add  $9, $0, $2
	
	mul $4, $8, $9

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall
	
# Q5) Faça um programa que leia um número inteiro entre 0 e 999 e imprima a soma dos
# algarismos desse número. Ex.: 358 gera uma saída de 16, pois 3+5+8 = 16
.text
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	addi $10, $0, 10
	
	div $8, $10
	mfhi $14
	mflo $8
	
	div $8, $10
	mfhi $13
	mflo $8
	
	div $8, $10
	mfhi $12
	mflo $8
	
	add $4, $14, $13
	add $4, $4, $12

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall