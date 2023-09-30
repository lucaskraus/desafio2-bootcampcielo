import React, { useState } from "react";
import FormsCnpj from "./FormsCnpj";
import FormsCpf from "./FormsCpf";
import Ilustration from "./Ilustration";
import logocielo from "../assets/cielo-logo.png";
import './Styles.scss';
import { Outlet } from "react-router-dom";

const Cadastro = () => {
    
    //State para atualização do tipo de formulário (cliente ou empresa)
    const [formsType, setFormsType] = useState(true);

    const changeType = () => {
    
        if (formsType === false) {
            setFormsType(!formsType);
        }
        else{
            setFormsType(!formsType);
        }
        
    };

    return (
        <div className="formsContainer">
            <div className="formsArea">
                <img src={logocielo} alt="Logo da Cielo" width='240px' height='80px'></img>
                {formsType ? <FormsCpf /> : <FormsCnpj />}
                <div className="chooseBox">
                    <button id='buttonChange' onClick={() => changeType()}>Trocar Tipo de Cadastro (CPF/CNPJ)</button>
                </div>  
            </div>
            <div className="ilustrationArea">
                <Ilustration />
            </div>
            <Outlet/>
        </div>
    );
};

export default Cadastro;
