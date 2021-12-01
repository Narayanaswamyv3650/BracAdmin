package com.teqsar.Listners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.teqsar.utils.DataProvideUtils;

//This class is written to customize the @Test Method annotation values 
public class AnnotationTransformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		//dataProvider = "getData", dataProviderClass = DataProvideUtils.class, retryAnalyzer = RetryFailedTests.class
		annotation.setDataProvider("getData");
		annotation.setDataProviderClass(DataProvideUtils.class);
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}

}
