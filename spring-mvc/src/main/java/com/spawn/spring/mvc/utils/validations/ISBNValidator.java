package com.spawn.spring.mvc.utils.validations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint( validatedBy = ISBNConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ISBNValidator  {

    public String value() default  "ISBN-";

    public String message() default  "must start with ISBN-";

    public Class<?>[] groups() default {};

    public Class< ? extends Payload> [] payload() default {};

}
