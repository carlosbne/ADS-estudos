.text
main:  	addi $8, $0, 0   # qtd de num
       	addi $9, $0, 0   # total da soma
       	addi $20, $0, 0  # maior numero
       	addi $21, $0, 1  # $21 = 1 constante
       
cont:  	addi $2, $0, 5   
       	syscall
       
       	add $9, $9, $2  # $9 recebe $9 + num lido
       	addi $8, $8, 1  # $8 = i + 1
       
       	slt $10, $20, $2  #se ($20 < $2) então $10 = 1 senao $10 = 0
       	beq $10, $21, maior

test:  	slt $11, $2, $0   #se ($2 < 0) então $11 = 1 senao $11 = 0
	beq $11, $0, cont     
       
subi:  	sub $9, $9, $2    #subtrai num negativo
	sub $8, $8, $21   #subtrai i = i-1
        j divi
       
maior:	sub $20, $20, $20
     	add $20, $0, $2
     	j test
     	
divi:	div $9, $8
	mflo $14
	
print:	add $4, $0, $20
	addi $2, $0, 1
	syscall
	
	add $4, $0, $14
	addi $2, $0, 1
	syscall
	
fim:	addi $2, $0, 10
	syscall