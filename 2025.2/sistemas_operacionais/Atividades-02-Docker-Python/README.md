# 2025.2-Atividades-03-Docker-Python
Atividade avaliativa para executar códigos python dentro de um container docker

## 📋 Atividade Avaliativa - Docker com Python

Esta atividade tem como objetivo ensinar a criar e executar containers Docker com Python para a disciplina de Sistemas Operacionais.

### 🎯 Objetivo

Criar uma imagem Docker baseada em Fedora, instalar Python, e executar programas Python dentro do container com mapeamento de volumes.

---

## ✅ Checklist da Atividade

### Parte 1: Preparação do Repositório

- [ ] **1.1** Fazer fork deste repositório para sua conta do GitHub
  - Acesse: https://github.com/sistemas-operacionais/2025.2-Atividades-03-Docker-Python
  - Clique no botão "Fork" no canto superior direito
  
- [ ] **1.2** Clonar o repositório forkado para sua máquina local
  ```bash
  git clone https://github.com/SEU_USUARIO/2025.2-Atividades-03-Docker-Python.git
  cd 2025.2-Atividades-03-Docker-Python
  ```

### Parte 2: Criar os Arquivos Python

- [ ] **2.1** Criar o arquivo `alomundo.py` com o seguinte conteúdo:
  ```python
  print("Alô, Mundo!")
  print("Bem-vindo ao container Docker com Python!")
  print("Sistemas Operacionais - 2025.2")
  ```

- [ ] **2.2** Criar o arquivo `calculadora.py` com o seguinte conteúdo:
  ```python
  def somar(a, b):
      return a + b

  def subtrair(a, b):
      return a - b

  def multiplicar(a, b):
      return a * b

  def dividir(a, b):
      if b != 0:
          return a / b
      else:
          return "Erro: Divisão por zero!"

  print("=== Calculadora Simples ===")
  print(f"10 + 5 = {somar(10, 5)}")
  print(f"10 - 5 = {subtrair(10, 5)}")
  print(f"10 * 5 = {multiplicar(10, 5)}")
  print(f"10 / 5 = {dividir(10, 5)}")
  ```



### Parte 3: Criar o Dockerfile

- [ ] **3.1** Criar o arquivo `Dockerfile` (sem extensão) na raiz do projeto

- [ ] **3.2** Adicionar a imagem base do Fedora:
  ```dockerfile
  FROM fedora:latest
  ```

- [ ] **3.3** Instalar o Python no container:
  ```dockerfile
  RUN dnf install -y python3 python3-pip && dnf clean all
  ```

- [ ] **3.4** Criar o diretório `/app` que será compartilhado:
  ```dockerfile
  RUN mkdir -p /app
  ```

- [ ] **3.5** Definir `/app` como diretório de trabalho:
  ```dockerfile
  WORKDIR /app
  ```

- [ ] **3.6** (Opcional) Definir um comando padrão:
  ```dockerfile
  CMD ["python3"]
  ```

- [ ] **3.7** Executar o terminal interativo do container e rodar os códigos Python manualmente:
  ```bash
  docker run --rm -it -v $(pwd):/app python-fedora-app bash
  ```
  Depois, dentro do terminal do container, execute:
  ```bash
  python3 /app/alomundo.py
  python3 /app/calculadora.py

- [ ] **3.8** Proposta prática: execute o terminal do container, rode o código `alomundo.py`, edite o arquivo e execute novamente para testar o mapeamento de volume:
  ```bash
  docker run --rm -it -v $(pwd):/app python-fedora-app bash
  ```
  Dentro do terminal do container, execute:
  ```bash
  python3 /app/alomundo.py
  ```
  Agora, no seu editor, altere o conteúdo do arquivo `alomundo.py` (por exemplo, troque a mensagem ou adicione uma linha). Salve o arquivo e, sem sair do terminal do container, execute novamente:
  ```bash
  python3 /app/alomundo.py
  ```
  Assim, você verifica que a alteração feita no arquivo do host é refletida imediatamente no container.
  ```


### Parte 4: Construir e Executar o Container

- [ ] **4.1** Construir a imagem Docker:
  ```bash
  docker build -t python-fedora-app .
  ```

- [ ] **4.2** Verificar se a imagem foi criada:
  ```bash
  docker images | grep python-fedora-app
  ```

- [ ] **4.3** Executar o programa `alomundo.py`:
  ```bash
  docker run --rm -v $(pwd):/app python-fedora-app python3 /app/alomundo.py
  ```

- [ ] **4.4** Executar o programa `calculadora.py`:
  ```bash
  docker run --rm -v $(pwd):/app python-fedora-app python3 /app/calculadora.py
  ```

- [ ] **4.5** Testar o mapeamento de volume editando um dos arquivos Python e executando novamente


### Parte 5: Finalização

- [ ] **5.1** Fazer commit das alterações:
  ```bash
  git add Dockerfile alomundo.py calculadora.py
  git commit -m "Adiciona Dockerfile e programas Python"
  ```

- [ ] **5.2** Fazer push para o repositório forkado:
  ```bash
  git push origin main
  ```

- [ ] **5.3** Verificar no GitHub se todos os arquivos estão presentes


### Parte 6: Relato do Aluno sobre a Atividade

- [ ] **6.1** Criar o arquivo `relatorio.md` na raiz do projeto

- [ ] **6.2** Adicionar a seção de Introdução
  - Explique o contexto da atividade, o objetivo e a importância do uso de Docker com Python.

- [ ] **6.3** Relatar as atividades realizadas
  - Descreva os passos seguidos, comandos utilizados, dificuldades encontradas e como solucionou cada etapa.

- [ ] **6.4** Considerações finais
  - Comente sobre as principais dificuldades, aprendizados e sugestões para futuras atividades.

## 📝 Explicação dos Conceitos

### O que é Docker?
Docker é uma plataforma que permite criar, executar e gerenciar containers - ambientes isolados que contêm tudo que uma aplicação precisa para funcionar.

### O que é Dockerfile?
Um Dockerfile é um arquivo de texto que contém instruções para construir uma imagem Docker. Cada instrução cria uma camada na imagem.

### Comandos principais do Dockerfile:
- **FROM**: Define a imagem base
- **RUN**: Executa comandos durante a construção da imagem
- **WORKDIR**: Define o diretório de trabalho dentro do container
- **COPY**: Copia arquivos do host para o container
- **CMD**: Define o comando padrão a ser executado

### Mapeamento de volumes (-v):
O parâmetro `-v $(pwd):/app` mapeia o diretório atual da máquina host para o diretório `/app` dentro do container. Isso permite que alterações feitas nos arquivos do host sejam refletidas no container em tempo real.

### Parâmetro --rm:
Remove automaticamente o container após sua execução, mantendo o sistema limpo.

---

## 🎓 Critérios de Avaliação

- ✅ Fork do repositório realizado corretamente
- ✅ Dockerfile criado com todas as instruções necessárias
- ✅ Arquivos Python funcionando corretamente
- ✅ Mapeamento de volume implementado
- ✅ Comandos Docker executados com sucesso
- ✅ Código versionado no GitHub

---

## 🆘 Solução de Problemas

### Docker não encontrado?
Certifique-se de que o Docker está instalado:
```bash
docker --version
```

### Permissão negada?
No Linux, adicione seu usuário ao grupo docker:
```bash
sudo usermod -aG docker $USER
```
(Faça logout e login novamente)

### Imagem não constrói?
Verifique se está no diretório correto e se o Dockerfile existe:
```bash
ls -la Dockerfile
```

### Erro de certificado SSL ou problemas com dnf?
Se você estiver tendo problemas para construir a imagem Fedora, pode tentar usar uma imagem Python oficial baseada em Alpine Linux (alternativa mais leve):

```dockerfile
# Dockerfile alternativo com Python Alpine
FROM python:3.11-alpine

WORKDIR /app

COPY alomundo.py calculadora.py /app/

CMD ["python3"]
```

Ou usar Python baseado em Debian:
```dockerfile
# Dockerfile alternativo com Python Debian
FROM python:3.11-slim

WORKDIR /app

COPY alomundo.py calculadora.py /app/

CMD ["python3"]
```

### Comandos Docker não funcionam com mapeamento de volume no Windows?
No Windows, use o caminho completo ou `%cd%` no CMD:
```cmd
docker run --rm -v %cd%:/app python-fedora-app python3 /app/alomundo.py
```

No PowerShell do Windows:
```powershell
docker run --rm -v ${PWD}:/app python-fedora-app python3 /app/alomundo.py
```

---

## 📚 Referências

- [Documentação oficial do Docker](https://docs.docker.com/)
- [Documentação do Fedora](https://docs.fedoraproject.org/)
- [Python.org](https://www.python.org/)

---

## 👨‍🏫 Informações da Disciplina

**Disciplina**: Sistemas Operacionais  
**Período**: 2025.2  
**Atividade**: 03 - Docker com Python
