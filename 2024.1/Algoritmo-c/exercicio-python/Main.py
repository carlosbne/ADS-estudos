""" from ListaLigada import ListaLigada as LL
from ListaLigadaOrdenada import ListaLigadaOrdenada as LLO """
from ListaCircular import No as No
from ListaCircular import ListaCircular as LC

def main(): 
    """ lista_ligada = LL() 
    lista_ligada_ordenada = LLO() """
    ListaCircular = LC()
    
    """lista_ligada.inserir_inicio(1)
    lista_ligada.inserir_inicio(2)
    lista_ligada.inserir_fim(3)
    
    lista_ligada_ordenada.inserir_no(1)
    lista_ligada_ordenada.inserir_no(11)
    lista_ligada_ordenada.inserir_no(3)"""

    ListaCircular.inserir_inicio(62)
    ListaCircular.inserir_inicio(64)
    ListaCircular.inserir_inicio(6)

     
    """ print("\nLISTA LIGADA SIMPLES")    
    lista_ligada.imprimir_lista()
    
    print("\nLISTA LIGADA ORDENADA")    
    lista_ligada_ordenada.imprimir_lista() """

    print("\nLISTA CIRCULAR")
    ListaCircular.imprimir_lista()

main() 