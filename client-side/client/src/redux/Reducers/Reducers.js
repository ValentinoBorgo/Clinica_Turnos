import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    modalModifiedPatient : false,
    patients : [],
    patientSelected : []
}

export const rootReducer = createSlice({
    name : 'clinica',
    initialState,
    reducers : {
        modalModifiedPatient : (state, action) =>{
            state.modalModifiedPatient = action.payload;
        },
        getPatients : (state, action) => {
            state.patients = action.payload;
        },
        getPatientSelected : (state, action) => {
            state.patientSelected = action.payload;
        }
    }
})

export const {
    modalModifiedPatient,
    getPatients,
    getPatientSelected
}  = rootReducer.actions;

export default rootReducer.reducer;