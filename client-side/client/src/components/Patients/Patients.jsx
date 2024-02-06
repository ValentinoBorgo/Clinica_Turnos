import React, { useEffect, useState } from "react";
import '../Patients/Patients.css';
import { ModalModifiedPatient } from "../../Modals/ModalModifiedPatient/ModalModifiedPatient";
import { FormModifiedPatient } from "../FormModifiedPatient/FormModifiedPatient";
import { useDispatch, useSelector } from 'react-redux'; 
import { getPatientSelected, getPatients, modalModifiedPatient } from "../../redux/Reducers/Reducers";
import { getPatientsPromise } from "../../redux/Actions/Actions";
import { v4 as uuidv4 } from 'uuid';


export function Patients({ patients }){

    const dispatch = useDispatch();

    let [carga, setCarga] = useState(true);

    const ModifiedPatient = useSelector(state => state.clinica.modalModifiedPatient);

    const handleModified = (p) =>{
        dispatch(modalModifiedPatient(!ModifiedPatient));
        dispatch(getPatientSelected(p))
    }

    useEffect(()=>{
        getPatientsPromise().then(patient =>{
            if(patient){
                setCarga(false);
            }
            dispatch(getPatients(patient))
        })

    },[dispatch])


    if(carga){
        return(
            <div className="error">
                <button className="btn btn-primary" type="button" disabled>
                    <span className="spinner-border spinner-border-sm" aria-hidden="true"></span>
                    <span role="status">Loading...</span>
                </button>
            </div>
        )
    }

    return(
        <>
        {
            ModifiedPatient && (
                <ModalModifiedPatient>
                    <FormModifiedPatient />
                </ModalModifiedPatient>
            )
        }
        <h2>Pacientes : </h2>
        <button className={`Agregar btn btn-outline-success`}>Agregar Paciente</button>
        <section className="Patients">
            <div>
                <table className="Tabla">
                    <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Fecha Nacimiento</th>
                        <th>Teléfono</th>
                        <th>Modificar</th>
                        <th>Eliminar</th>
                    </tr>
                    </thead>
                    {
                        patients?.map(p =>{
                            return (<thead key={p.idPaciente}>
                                <tr>
                                    <th>{p.nombre}</th>
                                    <th>{p.apellido}</th>
                                    <th>{p.fechaNac}</th>
                                    <th>{p.telefono}</th>
                                    <th><button className="btn btn-outline-warning" onClick={() => handleModified(p)}>*</button></th>
                                    <th><button className="btn btn-danger">X</button></th>
                                </tr>
                            </thead>
                        )})
                    }
                </table>
            </div>
        </section>
        </>
    )

}