import { useState } from 'react'
import { Landing } from './components/Landing/Landing'
import { Route, Routes } from 'react-router-dom'
import { Patients } from './components/Patients/Patients'
import { Shifts } from './components/Shifts/Shifts'


function App() {

  return (
    <>
    <div>
      <Landing />
      <Routes>
        <Route path='/' element={<p style={{marginLeft : '300px', marginTop : '100px', backgroundColor : 'red'}}>Hola mundo</p>} />
        <Route path='/log/pacientes' element={<Patients />} />
        <Route path='log/turnos' element={<Shifts />} />
      </Routes>
    </div>
    </>
  )
}

export default App
