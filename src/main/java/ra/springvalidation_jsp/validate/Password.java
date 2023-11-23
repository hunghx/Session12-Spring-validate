package ra.springvalidation_jsp.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordContraint.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    //error message
     String message() default "must be firt character uppercase , more less than 8";
    //represents group of constraints
     Class<?>[] groups() default {};
    //represents additional information about annotation
     Class<? extends Payload>[] payload() default {};
}
