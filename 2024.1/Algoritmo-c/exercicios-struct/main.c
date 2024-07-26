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
    printf("Selecione uma opção:\n"
           "0 - SAIR\n"
           "1 - INCLUIR CONTATO\n"
           "2 - LISTAR CONTATOS\n");
    scanf("%d", &opcaoEscolhida);

    switch (opcaoEscolhida) {
    case 1:
      printf("Informe o nome, email e número telefone:\n");
      scanf("%s, %s, %d", &contato[qtdContatos].nome,
            &contato[qtdContatos].email, &contato[qtdContatos].numero);
      break;
    case 2:
      for (int i = 0; i < qtdContatos; i++) {
        fprintf("" + i + "nome: " + contato[i].nome + "\n email: " +
                contato[i].email + "\n telefone: " + contato[i].numero + "\n");
      }
      break;
    }
  }

  return 0;
}