import React from "react";
import { Link, NavLink } from "react-router-dom";

export function NavBar(){

    return(
        <div>
        <nav>
            <ul>
                <li>
                    <NavLink to='/log/pacientes'>
                        Pacientes
                    </NavLink>
                </li>
                <li>
                    <NavLink to='/log/turnos'>
                        Turnos
                    </NavLink>
                </li>
            </ul>
        </nav>
    </div>
    );

}