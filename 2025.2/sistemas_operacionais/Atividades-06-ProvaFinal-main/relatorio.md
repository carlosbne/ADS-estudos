# Relatório - Prova Final de Sistemas Operacionais 2025.2 - Carlos Neto

## Introdução
Esta atividade teve como objetivo descrever o processo de criiação de um ambiente de desenvolvimento isolado para uma aplicação utilizando Django e Docker. A proposta foi construir uma imagem personalizada a partir do Fedora, configurar um container com volume e mapeamento de porta, e desenvolver uma aplicação Django simples. 
A atividade avaliativa foi realizado no contexto da disciplina de Sistemas Operacionais, ministrada pelo professor Leonardo Minora, no curso de Tecnologia de Análise e Desenvolvimento de Sistemas (TADS).  


## Relato das Atividades

Iniciei fazendo o fork do repositório base para minha conta pessoal no GitHub e realizei o clone local. Em seguida, criei a pasta `app` e o arquivo ``requirements.txt`` contendo a dependência do Django, dessa forma o Docker tem a informação necessária para quais bibliotecas Python instalar no container.

Com o ambiente inicial preparado, segui para próxima etapa **criação da imagem e execução do container**, essa imagem precisava conter o Python, o gerenciador de pacotes pip e a biblioteca Django, além de estar configurada para expor a porta padrão do servidor de desenvolvimento.

```
FROM fedora:latest

RUN dnf install -y python3 python3-pip && dnf clean all

WORKDIR /app

COPY requirements.txt .
RUN pip3 install --no-cache-dir -r requirements.txt

EXPOSE 8000

CMD ["bash"]
```

Com o Dockerfile pronto, executei o comando de build dentro da pasta app, que é onde o arquivo está localizado:

[![print-1-Docker.png](https://i.postimg.cc/kgLFvTt8/print-1-Docker.png)](https://postimg.cc/3kCvKC1J)

A saída do comando mostrou cada etapa sendo executada em camadas, confirmando que a instalação do Python e das dependências foi bem‑sucedida.


Com a imagem criada, foi a vez de criar e iniciar o container.

O parâmetro ``-p 8000:8000`` – mapeia a porta 8000 do container para a porta 8000 do host. Assim, qualquer requisição feita a http://localhost:8000 será direcionada ao servidor Django dentro do container. Assim o ``-v $(pwd)/app:/app`` – cria um volume que monta a pasta app do diretório atual do host dentro do container no caminho ``/app``, dessa forma qualquer alteração nos arquivos do projeto feita no host é refletida instantaneamente dentro do container, e vice-versa.
A listagem mostrou o container django-container, confirmando que o mapeamento de portas e o volume estavam funcionando conforme esperado.

[![print-2-Docker-Django.png](https://i.postimg.cc/9Fmhcp09/print-2-Docker-Django.png)](https://postimg.cc/grT5D3vc)

Em seguida, efetuei a criação e configuração da Aplicação Django. Criei o projeto chamado `myproject` com o comando ``django-admin startproject myproject``. Verifiquei no host a criação dos arquivos (manage.py, myproject/). Depois, criei a aplicação ``meuapp``, utilizando o comando ``python manage.py startapp meuapp``, confirmei a estrutura das pastas e se os arquivos estavam corretos. 

Para configuração, precisei editei o arquivo ``myproject/settings.py`` no host para adicionar ``'meuapp'`` em ``INSTALLED_APPS`` e configurar ``ALLOWED_HOSTS = ['localhost', '127.0.0.1']``. O banco de dados SQLite3 já estava configurado por padrão. Então segui com com as migrações utilizando o comando ``docker exec -it django-container python3 manage.py migrate``. 

[![print-3-Banco.png](https://i.postimg.cc/qBhLztDX/print-3-Banco.png)](https://postimg.cc/grpR70Wn)
Logo depois efetuei a criação do superusuário como solicitado, seguindo com o comando ``docker exec -it django-container python3 manage.py createsuperuser`` definindo usuário como admin e uma senha padrão.

Na sequência, efetuei as configurações necessárias para personalisar a view, editei o arquivo ``app/meuapp/views.py`` criando a função home que retrona uma resposta HTTP com a mensagem "Opa professor, sou Carlos Neto da turma SO 2025.2". Em seguida criei e configurei os arquivos de URLs, sendo eles `meuapp/urls.py` e `myproject/urls.py`, onde inclui a URL da aplicação.

Para executar o servidor de desenvolvimento e a aplicação segui com o comando `docker exec -it django-container python3 manage.py runserver 0.0.0.0:8000` como pode ver a seguir, foi efetuado com sucesso.
[![print-4-Execucao.png](https://i.postimg.cc/QdbgRcCv/print-4-Execucao.png)](https://postimg.cc/sMMZWQpJ)

### Imagem dos Testes no Navegador:
Home Acessei o navegador e apresentou a mensagem personalizada.
[![print-5-home.png](https://i.postimg.cc/3N9zmpLt/print-5-home.png)](https://postimg.cc/CnBvVZp8)


Assim como também apresentou a página do Admin.
[![print-6-admin.png](https://i.postimg.cc/xdH7gBsh/print-6-admin.png)](https://postimg.cc/gwzN2tbH)

## Considerações Finais

Fazer essa atividade foi um grande exercício prático. Entendi a lógica da imagem, do container e do volume, tudo fez mais sentido. O momento mais gratificante foi ver a aplicação rodando dentro do container e conseguindo acessá-la pelo navegador do meu computador, como se estivesse instalada localmente. Consegui ver na prática o seu funcionamento.

Tive algumas dificuldades com permissões de arquivos, porque os arquivos criados dentro do container ficavam com dono root no meu sistema,  por vezes exigiu ajustes manuais. Além da configuração inicial referente a utilização do Docker no WSL. 

Finalizando, o objetivo foi plenamente alcançado: o container está rodando com o Django, a aplicação é acessível pelo navegador e todo o código está versionado no repositório.