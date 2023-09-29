

const FormsCnpj = () => {

     return(
         <div className='formsBox'>
            <form>
                <label for='nome'>Nome do contato</label>
                <input type='text' id='nome'></input>
 
                <label for='cpf'>CNPJ</label>
                <input type='text' id='cpf'></input>
 
                <label for='email'>E-mail do Contato</label>
                <input type='email' id='email'></input>
 
                <label for='mcc'>Código MCC</label>
                <input type='text' id='mcc'></input>
            </form>

            <button type='submit'>Cadastrar Cliente</button>
         </div>
         
     )
}

export default FormsCnpj;