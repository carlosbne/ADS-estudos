.text
main:  addi $8, $0, 0   # i = 0
       addi $9, $0, 11   # $9 = constante 11
       addi $20, $0, 1
      
cont:  add $4, $0, $8
       addi $2, $0, 1 
       syscall
       
       add $4, $0, '\n'
       addi $2, $0, 11
       syscall
      
       addi $8, $8, 1
        
       slt $10, $8, $9  # se($8 < $9) então $10 = 1, senao $10 = 0
       beq $10, $20, cont
       
       addi $2, $0, 10
       syscall
