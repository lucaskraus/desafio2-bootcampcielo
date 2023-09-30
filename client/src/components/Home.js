import logocielo from '../assets/cielo-logo.png';
const Home = () => {
    return(
        <div>   
            <img src={logocielo} alt="Logo da Cielo" width='240px' height='80px'></img>
            <h1>Aplicação React em execução...</h1>
            <p>Teste as rotas de acordo com a documentação do GitHub</p>
        </div>

    )
}

export default Home;