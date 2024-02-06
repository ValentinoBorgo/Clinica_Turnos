import React from "react";
import '../FormModifiedPatient/FormModifiedPatient.css'
import { useDispatch, useSelector } from "react-redux";
import { modalModifiedPatient } from "../../redux/Reducers/Reducers";
import { useState } from "react";

export function FormModifiedPatient(){

    const dispatch = useDispatch();

    let [option, setOption] = useState("");

    const ModifiedPatient = useSelector(state => state.clinica.modalModifiedPatient);

    let getPatientSelected = useSelector(state => state.clinica.patientSelected);

    const handleExit = () => {
        dispatch(modalModifiedPatient(!ModifiedPatient))
    }

    const handleSelect = (e) => {
        if(e.target.value === "nombre"){
            setOption("Modifica el Nombre");
        }else if(e.target.value === "apellido"){
            setOption("Modifica el Apellido");
        }else if(e.target.value === "fechaNac"){
            setOption("Modifica la Fecha de Nacimiento");
        }else{
            setOption("Modifica el numero de Teléfono");
        }
        console.log(getPatientSelected);
        console.log("Target value " + e.target.value);
    }




    return(
        <>
        <form>
            <button className="btn btn-danger" onClick={handleExit} style={{marginTop : '-3rem', marginLeft : '-2rem'}}>X</button>
            <label>Selecciona lo que quieras modificar : </label>
            <select name="propiedades" id="prop" className="divs" onClick={(e) => handleSelect(e)}>
                <option value="nombre">Nombre</option>
                <option value="apellido">Apellido</option>
                <option value="fechaNac">Fecha Nacimiento</option>
                <option value="telefono">Teléfono</option>
            </select>
            {
                option && (
                    <>
                            <label className="divs">{option}</label>
                            <input type="text" className="divs" />
                            <button type="submit" className="btn btn-success divs">Modificar</button>
                    </>
                )
            }
        </form>
        </>
    )
}