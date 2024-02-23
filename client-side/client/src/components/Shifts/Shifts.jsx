import React, { useEffect } from "react";
import { getShiftsPromise } from "../../redux/Actions/Actions";
import { useDispatch } from "react-redux";

export function Shifts(){

    const dispatch = useDispatch();

    useEffect(() => {
        getShiftsPromise().then(s => {
            console.log(s)
        })
    },[dispatch])

    return(
        <>
        <div style={{marginLeft : '300px', marginTop : '100px', backgroundColor : 'red'}}>
            <h2>Turnos : </h2>
        </div>
        </>
    )

}