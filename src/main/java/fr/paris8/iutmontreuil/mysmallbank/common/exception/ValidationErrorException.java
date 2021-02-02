package fr.paris8.iutmontreuil.mysmallbank.common.exception;

import fr.paris8.iutmontreuil.mysmallbank.common.ValidationError;

import java.util.List;

public class ValidationErrorException extends RuntimeException {

    private final List<ValidationError> validationErrors;

    public ValidationErrorException(List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

}
