class No:
    def __init__(self, numero): 
        self.numero = numero
        self.proximo = None

class ListaCircular:
    def __init__(self):
        self.inicio = None
    
    def inserir_inicio(self, numero):
        novo_no = No(numero)
        if(self.inicio is None):
            self.inicio = novo_no
            novo_no.proximo = self.inicio
        else:
            ultimo_no = self.inicio
            while (ultimo_no.proximo != self.inicio):
                ultimo_no = ultimo_no.proximo
            novo_no.proximo = self.inicio
            ultimo_no.proximo = novo_no
            self.inicio = novo_no
    
        print("Efetuado com sucesso!")
        
    def imprimir_lista(self):
        no_atual = self.inicio
        while True:
            print(no_atual.numero, end=" -> ")
            no_atual = no_atual.proximo
            if no_atual == self.inicio:
                break
        print("FIM")
