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