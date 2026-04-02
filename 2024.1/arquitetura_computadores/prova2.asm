.text
main:  addi $2, $0, 5
       syscall
       add $8, $0, $2
       addi $2, $0, 5
       syscall
       add $9, $0, $2
       addi $10, $0, 1
       
       slt $11, $8, $9
       beq $11, $10, menor
       
       add $4, $0, $9
	addi $2, $0, 1
	syscall
	add $4, $0, $8
	addi $2, $0, 1
	syscall
	sub $21, $8, $9
	add $4, $0, $21
	addi $2, $0, 1
	syscall
	j fim
       
       
menor:  add $4, $0, $8
	addi $2, $0, 1
	syscall
	add $4, $0, $9
	addi $2, $0, 1
	syscall
	sub $20, $9, $8
	add $4, $0, $20
	addi $2, $0, 1
	syscall
	j fim
	
fim:   addi $2, $0, 10
       syscall