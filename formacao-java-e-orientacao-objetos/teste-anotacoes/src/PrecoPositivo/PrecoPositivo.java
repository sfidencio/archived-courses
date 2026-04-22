package PrecoPositivo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Valid apenas para FIELD, poderia ser METHOD
@Target(ElementType.FIELD)
//@Target(ElementType.METHOD)
//Valida apenas a nivel codigo ou compilador, diferente de RUNTIME..que e somente em tempo execucao
@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.RUNTIME)
public @interface PrecoPositivo {
}
