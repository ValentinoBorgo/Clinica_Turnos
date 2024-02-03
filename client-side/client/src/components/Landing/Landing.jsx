import React from "react";
import { NavBar } from "../NavBar/NavBar";
import '../Landing/Landing.css';

export function Landing(){
    return(
        <header className="Head">
            <div>
                <h1>🏥CLINICA</h1>
                <NavBar />
            </div>
        </header>
    )
}