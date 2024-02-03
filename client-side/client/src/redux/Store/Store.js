import {configureStore} from '@reduxjs/toolkit';
import Reducers from '../Reducers/Reducers';

export const store = configureStore({
    reducer : {
        clinica : Reducers
    }
})