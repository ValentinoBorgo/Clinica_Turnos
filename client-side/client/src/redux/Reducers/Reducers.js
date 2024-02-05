import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    modalModifiedPatient : false,
    patients : []
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
        }
    }
})

export const {
    modalModifiedPatient,
    getPatients
}  = rootReducer.actions;

export default rootReducer.reducer;