package com.teqsar.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.teqsar.constrans.FrameWorkConstants;

public class DataProvideUtils {

	@DataProvider(parallel=true)
	public static Object[] getData(Method m) {
		String testname=m.getName();
		List<Map<String,String>> list=ExcelUtils.getTestDetails(FrameWorkConstants.getIterationsheet());
		List<Map<String,String>> filterlist =new ArrayList<>();
		for (int i=0;i<list.size();i++) {
			if (list.get(i).get("testName").equalsIgnoreCase(testname) && 
				list.get(i).get("execute").equalsIgnoreCase("yes")) {
					filterlist.add(list.get(i));
			}
		}
		// while running the list dont try to add remove or adding elements --unless there is nessiciarty 
		return filterlist.toArray();
		
	}
}
