.text
main:   addi $8, $0, 0  #$8 variavel soma
	addi $9, $0, 0  #qtd de notas somadas
		
cont:	addi $2, $0, 5  #ler nota
        syscall
        
        add $8, $8, $2   #soma notas
        addi $9, $9, 1   # i = i+1      
    
        slt $10, $2, $0   #se ($2 < $0)$11 = 1, senao = 0
        beq $10, $0, cont  # se $10==0 j main
         
        sub $8, $8, $2   #retira a nota negativa
        addi $9, $9, -1  #decrementa a qtd de notas
          
        div $8, $9
        mflo $4
        
print:  addi $2, $0, 1   #imprimir nota
        syscall
        
 fim:   addi $2, $0, 10
 	syscall