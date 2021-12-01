package com.qa.Annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.teqsar.enums.CatrgoryType;



@Retention(RUNTIME)
@Target(METHOD)
public @interface FrameWorkAnnotation {

	
	public String[] author();
	public CatrgoryType[] category();
}
