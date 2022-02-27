package com.example.api.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.api.form.ArthmeticForm;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArthmeticController {

    private final Logger LOGGER = Logger.getLogger(ArthmeticController.class.getName());

    @PostMapping("add")
    public ResponseEntity<?>add(ArthmeticForm arthmeticForm){
        HttpHeaders responseHeaders = new HttpHeaders();
        try{
            return new ResponseEntity<String>(String.valueOf(arthmeticForm.getVal1() + arthmeticForm.getVal2()), HttpStatus.OK);
        }catch(Error e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage() + e.getClass());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("minus")
    public ResponseEntity<?>minus(ArthmeticForm arthmeticForm){
        HttpHeaders responseHeaders = new HttpHeaders();
        try{
            return new ResponseEntity<String>(String.valueOf(arthmeticForm.getVal1() - arthmeticForm.getVal2()), HttpStatus.OK);
        }catch(Error e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage() + e.getClass());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("cros")
    public ResponseEntity<?>cros(ArthmeticForm arthmeticForm){
        HttpHeaders responseHeaders = new HttpHeaders();
        try{
            return new ResponseEntity<String>(String.valueOf(arthmeticForm.getVal1() * arthmeticForm.getVal2()), HttpStatus.OK);
        }catch(Error e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage() + e.getClass());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("divid")
    public ResponseEntity<?>divid(ArthmeticForm arthmeticForm){
        HttpHeaders responseHeaders = new HttpHeaders();
        try{
            return new ResponseEntity<String>(String.valueOf(arthmeticForm.getVal1() / arthmeticForm.getVal2()), HttpStatus.OK);
        }catch(Error e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e){
            LOGGER.log(Level.SEVERE, e.getStackTrace().toString());
            responseHeaders.set("error-message",e.getMessage() + e.getClass());
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
