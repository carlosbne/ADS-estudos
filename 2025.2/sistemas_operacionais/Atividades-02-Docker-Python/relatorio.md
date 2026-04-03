# Relatório de atividade 03 - Sistemas operacionais

Aluno: Carlos Benigno Neto

## Introdução

Este relatório tem como propósito demonstrar o uso do Docker para a execução de aplicações Python em um ambiente isolado. Além disso, a atividade incluiu o processo de instalação e execução de scripts Python dentro do container.

## Relato

#### Passo 1

Depois de desenvolver todos os arquivos Python solicitados na atividade e incluir os comandos necessários para a configuração do ambiente no arquivo Dockerfile, realizei a construção da imagem Docker utilizando o comando:

```bash 
docker build -t python-fedora-app 
```
Em seguida, confirmei se a imagem havia sido criada corretamente.

![Passo 1](https://i.postimg.cc/HsdVVCph/1.png)

#### Passo 2
Efetuei toda a configuração de ambiente, e em seguida executei o comando do container criado.
Execução para arquivo .py:

![Passo 2](https://i.postimg.cc/TYfppXRS/2.png)

#### Passo 3
Efetuado as alterações no código python e atualizados imediatamente no container, assim confirmando o mapeamento de mudanças.

![img 4](https://i.postimg.cc/m2BttGbJ/3.png)

#### Passo 4
Construção e visualização da imagem Docker
![img 4](https://i.postimg.cc/pXRppt2g/4.png)

Modificações dos arquivos
![img 5](https://i.postimg.cc/pXRppt23/5.png)

## Conclusão

A atividade auxiliou bastante a elucidar algumas questões sobre a configuração e utilização básico do docker, assim como a utilização do arquivo Dockerfile.

Foi um ótimo exemplo de funcionamento e mudanças imediatas reconhecidas pelo container.