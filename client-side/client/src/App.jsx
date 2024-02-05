import { useState } from 'react'
import { Landing } from './components/Landing/Landing'
import { Route, Routes } from 'react-router-dom'
import { Patients } from './components/Patients/Patients'
import { Shifts } from './components/Shifts/Shifts'
import '../src/App.css';
import { useSelector } from 'react-redux'


function App() {

  const patients = useSelector(state => state.clinica.patients);

  return (
    <>
    <div>
      <Landing />
      <Routes>
        <Route path='/' element={<p style={{marginLeft : '300px', marginTop : '100px', backgroundColor : 'red'}}>Hola mundo</p>} />
        <Route path='/log/pacientes' element={<Patients patients={patients}/>} />
        <Route path='log/turnos' element={<Shifts />} />
      </Routes>
    </div>
    </>
  )
}

export default App
