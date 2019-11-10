# nordeste-Web-App

Requisitos para funcionamento da aplicação.
- Java instalado na maquina.
- Spring tool Suite 4.
- Banco de dados Mysql

Passos para rodar a aplicação.
- Criar o banco no mysql.
- Rodar script para geração das tabelas dentro do mysql. (logico.sql)
- Dentro do Spring Tool Suite:
    - Vá em file > import 
    - Procure a pasta Maven, selecione "Existing Maven Projects" e clique em next.
    - Selecione o diretorio dos arquivos do projeto Nordeste e clique em Finish. A aplicação irá carregar e instalar as dependências.

- Para configurar o banco, acesse o arquivo DataConfiguration, localizado em src/main/java. 
- Altere o nome do banco e a senha conforme desejado.
- Inicie a aplicação.

