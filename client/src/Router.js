import { Routes, Route } from 'react-router-dom';
import { Cadastrar } from './pages/cadastrar';
import { Listar } from './pages/listacpf';
import { Default } from './pages/default';

export function Router(){
  return (
    <Routes>
      <Route path="/" element={<Default/>} />
      <Route path="/cadastro" element={<Cadastrar/>} />
      <Route path="/fila" element={<Listar />} />
    </Routes>
  )
}

export default Router;