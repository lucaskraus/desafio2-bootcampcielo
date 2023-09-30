# desafio2-bootcampcielo
Repositório criado para a resolução do Desafio 2 do Bootcamp Cielo Dev em parceria com a Ada Tech <br/>

Agradecimentos: <br/>
Essas duas semanas foram incríveis! Foi um período de muita troca de informações e conhecimento. <br/>

Obrigado, Ada Tech, por promover um bootcamp tão bacana com instrutores excelentes. Jaque e Michael foram extramamente solícitos e disponíveis para todas as dúvidas do desafio e eventuais ajudas com a implementação dos projetos. <br/>

Obrigado, Cielo, pelo processo seletivo transparente. Hoje em dia, é muito raro vermos esse tipo de preocupação em informar a situação em que o candidato se encontra. Isso torna tudo mais prazeroso e nos deixa menos ansiosos pelos próximos passos. <br/>

<img width="500" height="200" alt="image" src="https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/ecab06c9-9b04-4003-98e7-ccf9f92f2eaf">

# Sobre o Projeto

Infelizmente, não foi possível finalizar todos os requisitos do projeto a tempo durante essa semana. Entretanto, acredito que o projeto esteja muito bem desenvolvido e com ideias bacanas na abordagem dos dados, UI, UX e estrutura web. <br/>

# Configuração de Ambiente

> [!WARNING]
> Para execução do repositório, serão necessárias as seguintes instalações:

- Node.JS (Node Package Manager)
- Java (Foi utilizada a versão JDK 17 para o desenvolvimento do desafio)
- Apache Maven (Foi utilizada a versão 3.8.6)

Foram criados três scripts, semelhantes ao desafio 1, para facilitar a execução do código nos computadores em que o mesmo será testado: <br/>

<img width="158" alt="image" src="https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/8353c2e7-f26d-45cc-8219-933e0178f0e1">

Sequencialmente, execute:

*client.bat* - Inicia a aplicação React. <br/>

<img width="178" alt="image" src="https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/92c22e2a-7538-482a-a491-81189e0c46e9">

*build.bat* - Configura as dependências da aplicação Maven. <br/>

<img width="146" alt="image" src="https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/d00e21d7-b1ab-4556-9c26-64729634819c">

*server.bat* - Executa o servidor Java para receber e enviar as solicitações. <br/>
<img width="184" alt="image" src="https://github.com/lucaskraus/desafio2-bootcampcielo/assets/72233741/28489eaa-9618-4b70-b82d-0980708a6bfd">

# Rotas

[localhost:3000/](https://localhost:3000/) - Rota default para verificação da build da aplicação React.<br/>
[localhost:3000/cadastro](https://localhost:3000/cadastro) - Rota para cadastro de clientes e empresas. Os registros são feitos em um banco de dados SQL criado na AWS. <br/>
[localhost:3000/fila/clientes](https://localhost:3000/fila/clientes) - Rota para exibição da fila dos clientes que foram pré-cadastrados. <br/>
[localhost:3000/fila/empresas](https://localhost:3000/fila/empresas) - Rota para exibição da fila das empresas que foram pré-cadastrados.


