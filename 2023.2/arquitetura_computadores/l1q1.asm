.text
# Q1) Fa�a um programa para ler um n�mero inteiro e imprimir o dobro desse n�mero.
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	
	sll $4, $8, 1

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall
	
#Q2) Fa�a um programa para ler um n�mero inteiro e imprimir o quadrado desse n�mero.
.text
main:	addi $2, $0, 5
	syscall
	add  $8, $0, $2
	
	mul $4, $8, $8

imp:	addi $2, $0, 1
	syscall

fim:	addi $2, $0, 10
	syscall

#Q3) Fa�a um programa para ler dois n�meros inteiros e imprimir a multiplica��o desses
#dois n�meros
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
	
# Q5) Fa�a um programa que leia um n�mero inteiro entre 0 e 999 e imprima a soma dos
# algarismos desse n�mero. Ex.: 358 gera uma sa�da de 16, pois 3+5+8 = 16
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