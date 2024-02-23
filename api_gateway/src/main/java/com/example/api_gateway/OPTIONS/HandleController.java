/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.api_gateway.OPTIONS;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/", allowedHeaders = "*")
public class HandleController {
    
    @RequestMapping(value = "/clientes/api/clinic/patients/edit/{id}", method = {RequestMethod.OPTIONS, RequestMethod.PUT})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> handleOptions(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:5173");
        headers.add("Access-Control-Allow-Methods", "PUT, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        return new ResponseEntity<>(headers,HttpStatus.OK);
    }
    
}
