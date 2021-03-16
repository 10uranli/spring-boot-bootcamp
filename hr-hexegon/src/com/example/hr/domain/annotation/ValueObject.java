package com.example.hr.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)/*sadece sýnýfa yapýstýrabilirsin dedik*/
@Retention(RetentionPolicy.RUNTIME)/*sadece developer icin note : source , framework yapýyorum reflaction vs olacaksa Runtime*/
public @interface ValueObject {

}
