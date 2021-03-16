package com.example.hr.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)/*sadece s�n�fa yap�st�rabilirsin dedik*/
@Retention(RetentionPolicy.RUNTIME)/*sadece developer icin note : source , framework yap�yorum reflaction vs olacaksa Runtime*/
public @interface ValueObject {

}
