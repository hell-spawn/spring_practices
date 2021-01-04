package com.spawn.spring.mvc.utils.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Custom validator
 */
public class ISBNConstraintValidator implements ConstraintValidator<ISBNValidator, String> {

    private String ISBNPrefix;

    @Override
    public void initialize(ISBNValidator constraintAnnotation) {
        this.ISBNPrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String ISBNValue, ConstraintValidatorContext context) {
        if(ISBNValue == null){
            return  true;
        }
        return  ISBNValue.startsWith(this.ISBNPrefix) ;
    }
}
