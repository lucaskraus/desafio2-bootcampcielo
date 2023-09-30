import ilustration from '../assets/ilustration.png'
import './Styles.scss';


const Ilustration = () => {

    return(
        <div className="ilustrationBox">
            <h1>Temos as soluções perfeitas para todo tipo de comércio</h1>
            <img src={ilustration} alt='Ilustração de computador' width='200px' height='200px'></img>
            <h3>Preencha o pré-cadastro para a área de Comercialização entrar em contato com o cliente</h3>
        </div>
    )
}

export default Ilustration;