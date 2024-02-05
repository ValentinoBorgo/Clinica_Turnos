import React from "react";
import '../FormModifiedPatient/FormModifiedPatient.css'
import { useDispatch, useSelector } from "react-redux";
import { modalModifiedPatient } from "../../redux/Reducers/Reducers";
import { useState } from "react";

export function FormModifiedPatient(){

    const dispatch = useDispatch();

    let [option, setOption] = useState("");

    const ModifiedPatient = useSelector(state => state.clinica.modalModifiedPatient);

    const handleExit = () =>{
        dispatch(modalModifiedPatient(!ModifiedPatient))
    }

    const handleSelect = (e) =>{
        setOption(e.target.value);
        console.log("Target value " + e.target.value);
        console.log(option);
    }




    return(
        <>
        <form>
            <button className="btn btn-danger" onClick={handleExit} style={{marginTop : '-3rem', marginLeft : '-2rem'}}>X</button>
            <label>Selecciona lo que quieras modificar : </label>
            <select name="propiedades" id="prop" className="divs" onClick={(e) => handleSelect(e)}>
                <option value="Nombre">Nombre</option>
                <option value="Apellido">Apellido</option>
                <option value="Fecha Nacimiento">Fecha Nacimiento</option>
                <option value="Teléfono">Teléfono</option>
            </select>
            {
                option && (
                    <>
                            <label className="divs">{option}</label>
                            <input type="text" className="divs" />
                    </>
                )
            }
        </form>
        </>
    )
}