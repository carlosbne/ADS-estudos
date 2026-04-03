# Atividade Avaliativa de 2025.2 - Prova final - Sistemas operacionais

## Informações gerais

- **Público alvo**: alunos da disciplina de **Sistemas operacionais** do curso de [TADS](https://diatinf.ifrn.edu.br/cursos/tecnologia-em-analise-e-desenvolvimento-de-sistemas/) na [DIATINF](https://diatinf.ifrn.edu.br/) no [CNAT-IFRN](https://portal.ifrn.edu.br/campus/natalcentral/)
- **Professor**: [L A Minora](https://github.com/leonardo-minora/)
- **Objetivo**:
  1. Criar 1 Dockerfile de desenvolvimento para uma aplicação web com django
  2. Montar pastas entre o sistema hospedeiro e o conteiner
  3. Mapear portas entre o sistema hospedeiro e o conteiner
  4. Lançar aplicação no conteiner e acessar via navegador no sistema hospedeiro
- **Data de entrega**: 27/03/2026

---
## Pré-requisitos

- Docker instalado e o serviço iniciado em sua máquina
- Conhecimentos básicos de Docker e comandos Linux
- Editor de texto (VS Code, Vim, Nano, etc.)

---
## Atividade

**Importante**: documente todo o processo realizado, incluindo:
- O relatório é textual por isso coloque como uma redação não uma lista de itens.
- O relato pode ser em primeira pessoa.
- Screenshots das páginas funcionando (home e admin) acessados pelo navegador do sistema hospedeiro.
- Screenshots das saídas da execução dos comandos no terminal.
- lembre de fazer _commit_ com texto explicativos de cada passo que modifique as pastas e/ou arquivos.
- lembre de fazer o _push_ no seu repositório ao final para entrega do resultado.

### Informações do relatório
1. Criar um arquivo no `relatorio.md` na raiz do repositório.
2. Coloque título e identificação (nome completo) com H1 (tag markdown `#`)
3. Colocar 3 seções principais com H2 (tag markdown `##`): introdução, relato das atividades, e considerações finais.
4. Na introdução, deve ter um contexto da atividade informando sobre disciplina, curso, diretoria e campus.
5. No relato das atividades, deve conter os screenshots e o passo a passo das atividade realizadas.
6. Por fim, em considerações finais, é um espaço para colocar aprendizado, dificuldades e sugestões.

### Checklist
- [ ] 1. Preparação do projeto
  - [ ] 1.1: Fork desse repositório para sua conta pessoal
  - [ ] 1.2: Clone do repositório github (remoto) para o computador local ou utilizar o _codespaces_
  - [ ] 1.3: Na pasta do projeto, crie a pasta `app`
  - [ ] 1.4: Criar arquivo `app/requirements.txt` e colocar apenas o django como biblioteca
- [ ] 2. Criar a imagem docker e executar o conteiner
  - [ ] 2.1: Criar o arquivo `app/Dockerfile.dev`
  - [ ] 2.2: Construir a imagem de desenvolvimento a partir da [última versão do Fedora](https://hub.docker.com/_/fedora)
  - [ ] 2.3: Executar container de desenvolvimento com volume e porta mapeado
- [ ] 3. Criar e configurar a aplicação Django
  - [ ] 3.1: Dentro do container, criar o projeto Django. Lembrar de verificar:
    -  de verificar a pasta e os arquivos do projeto estão na máquina hospedeira
    -  de verificar os direitos de escrita na pasta e arquivos do projeto na máquina hospedeira
  - [ ] 3.2: Criar uma aplicação Django. Lembrar de verificar:
    -  de verificar a pasta e os arquivos da aplicação estão na máquina hospedeira
    -  de verificar os direitos de escrita na pasta e arquivos da aplicação na máquina hospedeira
  - [ ] 3.3: Configurar (verificar) o banco de dados SQLite3
  - [ ] 3.4: Adicionar a aplicação ao settings.py do projeto
  - [ ] 3.5: Configurar ALLOWED_HOSTS no settings.py do projeto
  - [ ] 3.6: Executar as migrações do banco de dados do projeto
  - [ ] 3.7: Criar superusuário (admin) do projeto
  - [ ] 3.8: Criar uma view simples na aplicação e modificar o resultado padrão para algo como `alô professor, sou Fulano da turma SO 2025.2`
  - [ ] 3.9: Configurar URLs da aplicação
  - [ ] 3.10: Configurar URLs do projeto
- [ ] 4. Executar e acessar a aplicação Django
  - [ ] 4.1: Executar o servidor de desenvolvimento no conteiner
  - [ ] 4.2: Testar a aplicação abrindo o navegador no sistema hospedeiro
    - [Home](http://localhost:8000/)
    - [Administrativo](http://localhost:8000/admin/)
- [ ] Parte final. relatório
