# desafio2-bootcampcielo
Repositório criado para a resolução do Desafio 2 do Bootcamp Cielo Dev em parceria com a Ada Tech <br/>

Agradecimentos: <br/>
Essas duas semanas foram incríveis! Foi um período de muita troca de informações e conhecimento que agregaram muito para minha carreira. <br/>

Obrigado, Ada Tech, por promover um bootcamp tão bacana com instrutores excelentes. Jaque e Michael foram extremamente solícitos e disponíveis para todas as dúvidas do desafio e eventuais ajudas com a implementação dos projetos. <br/>

Obrigado, Cielo, pelo processo seletivo transparente. Nos dias de hoje, é muito raro vermos esse tipo de preocupação em informar a situação em que o candidato se encontra. Isso torna tudo mais prazeroso e nos deixa menos ansiosos pelos próximos passos. <br/>

![image](https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/28c3b35e-7c71-4a79-bf06-d9bb300c80ba)

# Configuração de Ambiente

> [!WARNING]
> Para execução do repositório, serão necessárias as seguintes instalações:

- Node.JS (Node Package Manager)
- Java (Foi utilizada a versão JDK 17 para o desenvolvimento do desafio)
- Apache Maven (Foi utilizada a versão 3.8.6)

Foram criados três scripts, semelhantes ao desafio 1, para facilitar a execução do código nos computadores em que o mesmo será testado: <br/>

![image](https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/d9c110d5-d439-4c15-8b39-c855880f2613) <br/>

Sequencialmente, execute:

*client.bat* - Inicia a aplicação React. <br/>

![image](https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/01a512e5-7a5a-40b1-87ff-dbe0b8ac2d0a) <br/>

*build.bat* - Configura as dependências da aplicação Maven. <br/>

![image](https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/b36c31da-481e-4784-82ad-2ace43ef0a58) <br/>

*server.bat* - Executa o servidor Java para receber e enviar as solicitações. <br/>
![image](https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/2cd3e441-8115-46d9-b720-cb17d4b2bfeb) <br/>

# Rotas

[localhost:3000/](https://localhost:3000/) - Rota default para verificação da build da aplicação React.<br/>
[localhost:3000/cadastro](https://localhost:3000/cadastro) - Rota para cadastro de clientes e empresas. Os registros são feitos em um banco de dados SQL criado na AWS. <br/>
[localhost:3000/fila/clientes](https://localhost:3000/fila/clientes) - Rota para exibição da fila dos clientes que foram pré-cadastrados. <br/>
[localhost:3000/fila/empresas](https://localhost:3000/fila/empresas) - Rota para exibição da fila das empresas que foram pré-cadastradas.

# Sobre o Projeto

Infelizmente, não foi possível finalizar todos os requisitos do projeto a tempo durante essa semana. Entretanto, acredito que o projeto esteja muito bem desenvolvido e com ideias bacanas na abordagem dos dados, UI, UX e estrutura web. <br/>

