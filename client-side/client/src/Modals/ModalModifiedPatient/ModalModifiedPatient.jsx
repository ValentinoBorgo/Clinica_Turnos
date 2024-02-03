import React from "react";
import { ReactDOM } from "react-dom";

export function ModalModifiedPatient({children}){
    return ReactDOM.createPortal(
        <div>
            {children}
        </div>,
        document.getElementById('modal-modificar-paciente')
    )
}