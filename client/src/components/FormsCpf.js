import Axios from 'axios';
import { useState, useEffect } from 'react';
import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './Styles.scss';

const FormsCpf = () => {
    
    //States para os campos do forms de CPF
    const [nome, setNome] = useState("");
    const [cpf, setCpf] = useState("");
    const [email, setEmail] = useState("");
    const [mcc, setMcc] = useState("");

    //Boolean state para envio do formulário
    const [formStatus, setFormStatus] = useState(false);

    useEffect(() => {
        if (formStatus) {
            Axios.post("http://localhost:8080/cielo/cadastro/pessoafisica",{
                "cpf": cpf,
                "mcc": mcc,
                "nome": nome,
                "email": email
            }).then((response) => {
                if (response.status === 200){
                    toast.success("O cadastro foi realizado com sucesso!");
                    setFormStatus(false);
                }
                else if (response.status === 500){
                    toast.error("Cadastro não efetuado. Revise os campos e preencha-os corretamente.")
                };
            }).catch(function(error){
                console.log(error);
            });
        };
    }, [cpf, mcc, nome, email, formStatus] )

    return(
        <div className='formsBox'>
            <form method='POST'>
                <div className='inputBox'>
                    <input type='text' id='nome' className='input' placeholder='Nome do cliente' required 
                    onChange={(e) =>{setNome(e.target.value)}}></input>
                </div>
                <div className='inputBox'>
                    <input type='text' id='cpf' className='input' placeholder='CPF' required
                    onChange={(e) =>{setCpf(e.target.value)}}></input>
                </div>
                <div className='inputBox'>
                    <input type='text' id='email' className='input' placeholder='E-mail' required
                    onChange={(e) =>{setEmail(e.target.value)}}></input>
                </div>
                <div className='inputBox'>
                    <input type='text' id='mcc' className='input' placeholder='Código MCC' required 
                    onChange={(e) =>{setMcc(e.target.value)}}></input>
                </div>
            </form>

            <button type='submit' id='buttonSubmit' onClick={() => setFormStatus(true)}>Cadastrar Cliente</button>
        </div>
        
    )
}

export default FormsCpf;