import React from "react";
import '../Patients/Patients.css';
import { ModalModifiedPatient } from "../../Modals/ModalModifiedPatient/ModalModifiedPatient";
import { FormModifiedPatient } from "../FormModifiedPatient/FormModifiedPatient";

export function Patients(){

    const handleModified = () =>{
        console.log("hola");
        return(
            <ModalModifiedPatient>
                <FormModifiedPatient />
            </ModalModifiedPatient>
        )
    }

    return(
        <>
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
                <thead>
                    <tr>
                        <th>Valentino</th>
                        <th>Borgo</th>
                        <th>22/01/2000</th>
                        <th>3424381461</th>
                        <th><button className="btn btn-outline-warning" onClick={handleModified}>*</button></th>
                        <th><button className="btn btn-danger">X</button></th>
                    </tr>
                    <tr>
                        <th>Valentino</th>
                        <th>Borgo</th>
                        <th>22/01/2000</th>
                        <th>3424381461</th>
                        <th><button className="btn btn-outline-warning">*</button></th>
                        <th><button className="btn btn-danger">X</button></th>
                    </tr>
                    <tr>
                        <th>Valentino</th>
                        <th>Borgo</th>
                        <th>22/01/2000</th>
                        <th>3424381461</th>
                        <th><button className="btn btn-outline-warning">*</button></th>
                        <th><button className="btn btn-danger">X</button></th>
                    </tr>
                </thead>
            </table> 
            </div>
        </section>
        </>
    )

}