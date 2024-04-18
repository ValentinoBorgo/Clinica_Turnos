import React from "react";
import axios from 'axios'

export const getPatientsPromise = async () =>{
    try{
        const response = await axios.get('http://localhost:3000/clientes/api/clinic/patients/get');
        return response.data;
    }catch(error){
        console.log(error)
    }
} 

export const getShiftsPromise = async () =>{
    try{
        const response = await axios.get('http://localhost:3000/turnos/api/shifts/all/get');
        return response.data;
    }catch(error){
        console.log(error)
    }
} 

export const modifiedPatient = async (data) => {
    try{
        const {idPaciente, nombre, apellido, dni, telefono, fechaNac} = data;
        const response = await axios.put('http://localhost:3000/clientes/api/clinic/patients/edit/'+ idPaciente, data,{
        });
        alert("Paciente " + nombre + " a sido modificado correctamente");
    }catch(error){
        console.log("El error es  : ", error);
    }
}