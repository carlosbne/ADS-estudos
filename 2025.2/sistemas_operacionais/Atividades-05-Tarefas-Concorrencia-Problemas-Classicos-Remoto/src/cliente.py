#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Cliente TCP para gerenciamento de vagas de estacionamento.
O cliente envia comandos ao servidor para consultar,
pegar e liberar vagas.

Autor: ChatGPT e Copilot com orientação e revisão de Minora
Data: 2024-06-15

Procure por FIXME para identificar pontos que precisam de implementação adicional.

"""

import threading
import socket
import os
import time
import random
from dotenv import load_dotenv


class ClienteEstacionamento(threading.Thread):
    def __init__(self, socket_cliente, cliente_id):
        threading.Thread.__init__(self)
        self.socket_cliente = socket_cliente
        self.cliente_id = cliente_id

    def run(self):
        # Método de execução da thread.
        print(f'Cliente {self.cliente_id} iniciado')

        if self.consultar_vaga():
            if self.pegar_vaga():
                self.passear()
                self.liberar_vaga()

        self.socket_cliente.close()
        print(f'Cliente {self.cliente_id} finalizado')

    def consultar_vaga(self):
        # Consulta a quantidade de vagas disponíveis no servidor.
        self.socket_cliente.send('consultar_vaga'.encode('utf-8'))
        resposta = int(self.socket_cliente.recv(1024).decode('utf-8'))
        return resposta > 0

    def pegar_vaga(self):
        # Tenta pegar uma vaga no servidor.
        self.socket_cliente.send('pegar_vaga'.encode('utf-8'))
        resposta = self.socket_cliente.recv(1024).decode('utf-8')
        return resposta == '1'

    def liberar_vaga(self):
        # Libera a vaga ocupada no servidor.
        self.socket_cliente.send('liberar_vaga'.encode('utf-8'))
        resposta = self.socket_cliente.recv(1024).decode('utf-8')
        return resposta == '1'
    
    def passear(self):
        # Simula o tempo que o cliente fica com a vaga ocupada.
        tempo = random.uniform(1, 3)
        print(f'Cliente {self.cliente_id} usando a vaga por {tempo:.1f}s')
        time.sleep(tempo)

def criar_socket_cliente():
    # Cria e retorna um socket TCP para o cliente.
    load_dotenv()
    PORTA = int(os.getenv('PORT', 5000))

    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    cliente.connect(('localhost', PORTA))
    print('Conectado ao servidor de estacionamento')
    return cliente

def main():
    # Função principal para iniciar o cliente.
    clientes = []
    # Lembre que são 50 clientes concorrentes
    for i in range(50):
        socket_cliente = criar_socket_cliente()
        cliente = ClienteEstacionamento(socket_cliente, i)
        clientes.append(cliente)
        cliente.start()

    for cliente in clientes:
        cliente.join()
    
    print('Todos os clientes finalizaram')


if __name__ == "__main__":
    main()