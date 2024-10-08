package introse.group20.hms.webapi;

import introse.group20.hms.core.exceptions.BaseException;
import introse.group20.hms.core.exceptions.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleException(Exception e) {
        // Customize the response based on the exception type
        HttpStatus status = determineHttpStatus(e);
        System.out.println(e);
        return new ResponseEntity<ErrorMessage>(new ErrorMessage(e.getMessage(), status.value()), status);
    }

    private HttpStatus determineHttpStatus(Exception e) {

        if (e instanceof BaseException) {
            return HttpStatus.valueOf(((BaseException) e).getStatusCode());
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
