#include <stdio.h>

// structs
struct Contatos {
  char nome[20];
  char email[50];
  int numero;
};

int main() {
  struct Contatos contato[100];
  int qtdContatos = 0;
  int opcaoEscolhida = -1;

  while (opcaoEscolhida != 0) {
    printf("\nSelecione uma opção:\n"
           "0 - SAIR\n"
           "1 - INCLUIR CONTATO\n"
           "2 - LISTAR CONTATOS\n");
    scanf("%d", &opcaoEscolhida);

    switch (opcaoEscolhida) {
    case 1:
      printf("\nInforme o nome, email e número telefone:\n");
      scanf("%s %s %d", &contato[qtdContatos].nome, &contato[qtdContatos].email,
            &contato[qtdContatos].numero);
      qtdContatos++;
      break;
    case 2:
      for (int i = 0; i < qtdContatos; i++) {
        printf("Nome: %s\nEmail: %s\nTelefone: %d\n\n", contato[i].nome,
               contato[i].email, contato[i].numero);
      }
      break;
    default:
      if (opcaoEscolhida == 0) {
        break;
      }
      break;
    }
  }

  return 0;
}
