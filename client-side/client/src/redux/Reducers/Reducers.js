import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    modalModifiedPatient : false,
}

export const rootReducer = createSlice({
    name : 'clinica',
    initialState,
    reducers : {
        modalModifiedPatient : (state, action) =>{
            state.modalModifiedPatient = action.payload;
        }
    }
})

export const {
    modalModifiedPatient
}  = rootReducer.actions;

export default rootReducer.reducer;