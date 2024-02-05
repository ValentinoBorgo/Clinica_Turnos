import React from "react";
import { ReactDOM } from "react-dom";
import { createPortal } from "react-dom";
import '../ModalModifiedPatient/ModalModifiedPatient.css';

export function ModalModifiedPatient ({children}){
    return createPortal(
        <div className="Modal">
            {children}
        </div>,
        document.getElementById('modal-modificar-paciente')
    )
}