# 3.2 - Imagem base
FROM fedora:latest

# 3.3 - Instalar Python dentro do container
RUN dnf install -y python3 python3-pip && dnf clean all

# 3.4 - Criar diretório /app
RUN mkdir -p /app

# 3.5 - Definir /app como diretório de trabalho
WORKDIR /app

# 3.6 (opcional) - Comando padrão ao rodar o container
CMD ["python3"]
