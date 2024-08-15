from ListaLigada import No as No

class ListaLigadaOrdenada:
    def __init__(self):
        self.inicio = None
        self.fim = None
 
    def esta_vazio(self):
        return self.inicio is None

    def inserir_no(self, numero):
        novo_no = No(numero)

        if self.esta_vazio():
            self.inicio = novo_no
            self.fim = novo_no
            novo_no.proximo = novo_no
        else:
            atual = self.inicio
            while atual.proximo != self.inicio and numero > atual.proximo.numero:
                atual = atual.proximo

            novo_no.proximo = atual.proximo
            atual.proximo = novo_no

            if atual == self.fim:
                self.fim = novo_no

    def remover(self, numero):
        if self.esta_vazio():
            return

        atual = self.inicio
        anterior = None

        while atual.numero != numero:
            anterior = atual
            atual = atual.proximo
            if atual == self.inicio:
                return  # Elemento não encontrado

        if anterior is None:  # Primeiro elemento
            self.inicio = atual.proximo
            self.fim.proximo = self.inicio
        elif atual == self.fim:  # Último elemento
            anterior.proximo = self.inicio
            self.fim = anterior
        else:  # Elemento no meio
            anterior.proximo = atual.proximo

    def buscar(self, numero):
        atual = self.inicio
        while atual:
            if atual.numero == numero:
                return True
            atual = atual.proximo
            if atual == self.inicio:
                break
        return False

    def imprimir_lista(self):
        if self.esta_vazio():
            print("Lista vazia") 
            return

        atual = self.inicio
        while True:
            print(atual.numero, end=" -> ")
            atual = atual.proximo
            if atual == self.inicio:
                break
        print("FIM") 