import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import Header from './components/header/Header'
import HomePage from './pages/HomePage'
import SobrePage from './pages/SobrePage'
import ContatoPage from './pages/ContatoPage'
import MainLayout from './layout/MainLayout'

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<MainLayout />}>        
          <Route path='/home' element={<HomePage />}/>
          <Route path='/sobre' element={<SobrePage />} />
          <Route index  element={<ContatoPage />} />
          <Route path='/contato'  element={<ContatoPage />} />
        </Route>

        <Route path='*' element="Tela de erro" />

      </Routes>
    </BrowserRouter>
  )
}

export default App
