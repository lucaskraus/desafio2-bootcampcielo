import React, { useState, useEffect } from 'react';
import axios from 'axios';
import logocielo from '../assets/cielo-logo.png';
import './Styles.scss';

const ListaEmpresas = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8080/cielo/fila/pessoajuridica');
        setData(response.data);
      } catch (error) {
        console.error('Erro ao buscar dados:', error);
      }
    };

    fetchData();
  }, []);

  return (
    <div className="tabela-container">
      <img src={logocielo} alt="Logo da Cielo" width='240px' height='80px'></img>
      <h1>Lista de Empresas Pré-Cadastradas</h1>
      <div className="tabela-scroll">
        <table className="tabela-clientes">
          <thead>
            <tr>
              <th>ID</th>
              <th>CNPJ</th>
              <th>Razão Social</th>
              <th>MCC</th>
              <th>CPF do Contato</th>
              <th>Nome do Contato</th>
              <th>Email do Contato</th>
            </tr>
          </thead>
          <tbody>
            {data.map((empresa) => (
              <tr key={empresa.id}>
                <td>{empresa.id}</td>
                <td>{empresa.cnpj}</td>
                <td>{empresa.razaoSocial}</td>
                <td>{empresa.mcc}</td>
                <td>{empresa.cpfContato}</td>
                <td>{empresa.nomeContato}</td>
                <td>{empresa.emailContato}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
      <h3>Prezado, colaborador</h3>
      <p>Prezamos pela agilidade no atendimento. Por favor, entre em contato com as empresas pré-cadastradas</p>
    </div>
  );
};

export default ListaEmpresas;
