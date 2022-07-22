package com.example.customerportal.apis;

import com.example.customerportal.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationErrorHandler {
    @ExceptionHandler
    public ResponseEntity<?> handleRecordNotFound(RecordNotFoundException rnef) {
        //	logging this exception
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler
    public ResponseEntity<?> handleOtherExceptions(Throwable throwable) {
        //	logging this exception
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
    }
}
