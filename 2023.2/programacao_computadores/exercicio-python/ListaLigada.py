class No:
    def __init__(self, numero):
        self.numero = numero
        self.proximo = None
        """ self.anterior = None """
 

class ListaLigada:
    def __init__(self):
        self.inicio = None

    def inserir_fim(self, numero):
        novo_no = No(numero)

        if self.inicio is None:
            self.inicio = novo_no 
            return
        
        ultimo_no = self.inicio
        while ultimo_no.proximo:
            ultimo_no = ultimo_no.proximo
        ultimo_no.proximo = novo_no

    def inserir_inicio(self, numero):
        novo_no = No(numero)
        novo_no.proximo = self.inicio
        self.inicio  = novo_no

    def imprimir_lista(self):
        no_atual = self.inicio
        while no_atual:
            print(no_atual.numero, end=" -> ")
            no_atual = no_atual.proximo
        print("FIM")
        
    