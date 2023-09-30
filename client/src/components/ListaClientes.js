import React, { useState, useEffect } from 'react';
import axios from 'axios';
import logocielo from '../assets/cielo-logo.png';
import './Styles.scss';

const ListaClientes = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8080/cielo/fila/pessoafisica');
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
        <h1>Lista de Clientes</h1>
        <div className="tabela-scroll">
            <table className="tabela-clientes">
            <thead>
                <tr>
                <th>ID</th>
                <th>CPF</th>
                <th>MCC</th>
                <th>Nome</th>
                <th>Email</th>
                </tr>
            </thead>
            <tbody>
                {data.map((cliente) => (
                <tr key={cliente.id}>
                    <td>{cliente.id}</td>
                    <td>{cliente.cpf}</td>
                    <td>{cliente.mcc}</td>
                    <td>{cliente.nome}</td>
                    <td>{cliente.email}</td>
                </tr>
                ))}
            </tbody>
            </table>
        </div>
            <h3>Prezado, colaborador</h3>
            <p>Prezamos pela agilidade no atendimento. Por favor, entre em contato com os clientes pré-cadastrados</p>
        </div>
  );
};

export default ListaClientes;
