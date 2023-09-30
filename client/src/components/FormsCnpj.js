import Axios from 'axios';
import { useState, useEffect } from 'react';
import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './Styles.scss';

const FormsCnpj = () => {
    const [nomeContato, setNomeContato] = useState("");
    const [emailContato, setEmailContato] = useState("");
    const [cpfContato, setCpfContato] = useState("");
    const [cnpj, setCnpj] = useState("");
    const [razaoSocial, setRazaoSocial] = useState("");
    const [mcc, setMcc] = useState("");
    const [formStatus, setFormStatus] = useState(false);

    useEffect(() => {
        if (formStatus) {
            Axios.post("http://localhost:8080/cielo/cadastro/pessoajuridica", {
                "nomeContato": nomeContato,
                "emailContato": emailContato,
                "cpfContato": cpfContato,
                "cnpj": cnpj,
                "razaoSocial": razaoSocial,
                "mcc": mcc
            }).then((response) => {
                if (response.status === 200) {
                    toast.success("O cadastro foi realizado com sucesso!");
                    setFormStatus(false);
                } else if (response.status === 500) {
                    toast.error("Cadastro não efetuado. Revise os campos e preencha-os corretamente.");
                }
            }).catch(function (error) {
                console.log(error);
            });
        }
    }, [nomeContato, emailContato, cpfContato, cnpj, razaoSocial, mcc, formStatus]);

    return (
        <div className='formsBox'>
            <form>
                <div className='inputBox'>
                    <input type='text' id='nomeContato' className='input' placeholder='Nome do Contato' required
                        onChange={(e) => { setNomeContato(e.target.value) }}></input>
                </div>

                <div className='inputBox'>
                    <input type='email' id='emailContato' className='input' placeholder='E-mail do Contato' required
                        onChange={(e) => { setEmailContato(e.target.value) }}></input>
                </div>

                <div className='inputBox'>
                    <input type='text' id='cpfContato' className='input' placeholder='CPF do Contato' required
                        onChange={(e) => { setCpfContato(e.target.value) }}></input>
                </div>

                <div className='inputBox'>
                    <input type='text' id='cnpj' className='input' placeholder='CNPJ' required
                        onChange={(e) => { setCnpj(e.target.value) }}></input>
                </div>

                <div className='inputBox'>
                    <input type='text' id='razaoSocial' className='input' placeholder='Razão Social' required
                        onChange={(e) => { setRazaoSocial(e.target.value) }}></input>
                </div>

                <div className='inputBox'>
                    <input type='text' id='mcc' className='input' placeholder='Código MCC' required
                        onChange={(e) => { setMcc(e.target.value) }}></input>
                </div>
            </form>
            <button type='submit' id='buttonSubmit' onClick={() => setFormStatus(true)}>Cadastrar Empresa</button>
        </div>
    )
}

export default FormsCnpj;
