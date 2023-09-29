import React, { useState } from "react";
import FormsCnpj from "./FormsCnpj";
import FormsCpf from "./FormsCpf";
import Ilustration from "./Ilustration";

const Cadastro = () => {
    
    //State para atualização do tipo de formulário (cliente ou empresa)
    const [formsType, setFormsType] = useState(true);

    const changeType = () => {
        setFormsType(!formsType);
    };

    return (
        <div className="formsContainer">
            <div className="formsArea">
                <button onClick={changeType}>Cliente</button>
                <button onClick={changeType}>Empresa</button>
                {formsType ? <FormsCpf /> : <FormsCnpj />}
            </div>
            <div className="ilustrationArea">
                <Ilustration />
            </div>
        </div>
    );
};

export default Cadastro;
