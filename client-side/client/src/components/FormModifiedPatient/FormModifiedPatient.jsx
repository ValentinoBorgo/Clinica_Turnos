import React from "react";
import '../FormModifiedPatient/FormModifiedPatient.css'
import { useDispatch, useSelector } from "react-redux";
import { modalModifiedPatient } from "../../redux/Reducers/Reducers";
import { useState } from "react";
import { modifiedPatient } from "../../redux/Actions/Actions"; 

export function FormModifiedPatient(){

    const dispatch = useDispatch();

    let [option, setOption] = useState([]);

    let [input, setInput] = useState([]);

    const ModifiedPatient = useSelector(state => state.clinica.modalModifiedPatient);

    let getPatientSelected = useSelector(state => state.clinica.patientSelected);

    const handleExit = () => {
        dispatch(modalModifiedPatient(!ModifiedPatient))
    }

    const handleSelect = (e) => {
        if(e.target.value === "nombre"){
            setOption(["Modifica el Nombre", "nombre"]);
        }else if(e.target.value === "apellido"){
            setOption(["Modifica el Apellido", "apellido"]);
        }else if(e.target.value === "fechaNac"){
            setOption(["Modifica la Fecha de Nacimiento", "fechaNac"]);
        }else{
            setOption(["Modifica el numero de Teléfono", "telefono"]);
        }
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        const last = {...getPatientSelected}
        let prop = option[1];
        last[prop] = input;
        console.log(last);
        modifiedPatient(last);
        dispatch(modalModifiedPatient(!ModifiedPatient))
    }

    const handleInputText = (e) => {
        setInput(e.target.value);
    }




    return(
        <>
        <form onSubmit={(e) => handleSubmit(e)}>
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
                            <label className="divs">{option[0]}</label>
                            <input type="text" className="divs" onChange={(e) => handleInputText(e)}/>
                            <button type="submit" className="btn btn-success divs">Modificar</button>
                    </>
                )
            }
        </form>
        </>
    )
}