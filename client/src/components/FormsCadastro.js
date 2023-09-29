import { useState, useEffect, useRef } from 'react';


const FormsCadastro = () => {
    return(
        <div className='formsCadastro'>
            <form>
                <label for='nome'>Nome do cliente</label>
                <input type='text' id='nome'></input>

                <label for='cpf'>CPF</label>
                <input type='text' id='cpf'></input>

                <label for='email'>E-mail</label>
                <input type='text' id='email'></input>

                <label for='mcc'>Código MCC</label>
                <input type='text' id='mcc'></input>
            </form>
            <button type='submit'>Cadastrar Cliente</button>
        </div>
        
    )
}

export default FormsCadastro;