package com.dh.ClinicaDefinitivo.badExceptions;

public class BadRequestException extends Exception{
    public BadRequestException(String massage){
        super(massage);
    }
}
