import { Routes, Route } from 'react-router-dom';
import { Cadastrar } from './pages/cadastrar';
import { Listar } from './pages/listacpf';
import { ListarCnpj } from './pages/listacnpj';
import { Default } from './pages/default';

export function Router(){
  return (
    <Routes>
      <Route path="/" element={<Default/>} />
      <Route path="/cadastro" element={<Cadastrar/>} />
      <Route path="/fila/clientes" element={<Listar />} />
      <Route path="/fila/empresas" element={<ListarCnpj />} />
    </Routes>
  )
}

export default Router;