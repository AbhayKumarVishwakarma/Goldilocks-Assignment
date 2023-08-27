package com.goldi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Use to handle the user exception
     * @param ex
     * @param wb
     * @return Error details
     */
    @ExceptionHandler(UserException.class)
    public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException ex, WebRequest wb){

        MyErrorDetails err = new MyErrorDetails();
        err.setTime(LocalDate.now());
        err.setMessage(ex.getMessage());
        err.setDetails(wb.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    /**
     * Use to handle the all other type of exception
     * @param ex
     * @param wb
     * @return  Error details
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> exceptionHandler(Exception ex, WebRequest wb){

        MyErrorDetails err = new MyErrorDetails();
        err.setTime(LocalDate.now());
        err.setMessage(ex.getMessage());
        err.setDetails(wb.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

}
