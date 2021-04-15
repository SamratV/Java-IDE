package ide.java.compile.controller;

import ide.java.compile.entity.TestCaseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CompilerRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<TestCaseError> handleException(Exception e) {
        ResponseEntity<TestCaseError> responseEntity;

        if(e instanceof  HttpRequestMethodNotSupportedException) {
            TestCaseError error = new TestCaseError(
                HttpStatus.METHOD_NOT_ALLOWED.value(),
                "Method not supported.",
                System.currentTimeMillis()
            );
            responseEntity = new ResponseEntity<>(error, HttpStatus.METHOD_NOT_ALLOWED);
        } else {
            TestCaseError error = new TestCaseError(
                HttpStatus.BAD_REQUEST.value(),
                "Bad request.",
                System.currentTimeMillis()
            );
            responseEntity = new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
}
