package fr.paris8.iutmontreuil.mysmallbank.account.exposition;

import fr.paris8.iutmontreuil.mysmallbank.common.exception.BusinessException;
import fr.paris8.iutmontreuil.mysmallbank.common.exception.ValidationErrorException;
import fr.paris8.iutmontreuil.mysmallbank.common.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestControllerAdvice
public class GlobalAdviceController {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> onEntityNotFoundException() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> onBusinessException(Exception exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

    @ExceptionHandler(ValidationErrorException.class)
    public ResponseEntity<List<ValidationError>> onValidationErrorException(ValidationErrorException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getValidationErrors());
    }

}
