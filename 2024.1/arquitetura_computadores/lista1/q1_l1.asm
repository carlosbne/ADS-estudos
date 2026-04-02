#data valida
.text 		
main: 	addi $2, $0, 5
        syscall    # le um inteiro
         
        add $8, $0, $2  
         	
        sll $8, $8, 1  # desloca para esquerda mult 2
          	
        add $4, $0, $8  # $4 <<- $8
          	
        addi $2, $0, 1 
        syscall     	#imprime o inteiro

fim: 	addi $2, $0, 10  
	syscall		# fecha o programa

