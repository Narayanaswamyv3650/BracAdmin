package com.teqsar.constrans;


import com.teqsar.enums.ConfigProperties;
import com.teqsar.utils.PropertyFileUtils;

/**
 * Framework Constants holds all the constant values used within the framework. If some value needs to be changed
 * or modified often, then it should be stored in the property files
 * 
 * @author Narayana
 *
 */
public final class FrameWorkConstants {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private FrameWorkConstants() {
	}
	private static final String RESOURCESPATH=System.getProperty("user.dir")+ "/src/test/resources";
	private static final String CHROMEDRIVERPATH =RESOURCESPATH+ "/chromedriver.exe";
	private static final String FIREFOXDRIVERPATH =RESOURCESPATH+ "/geckodriver.exe";
	private static final String PROPERTYFILEPATH = RESOURCESPATH+"/FrameworkProperties/Details.properties";
	private static final String JSONFILEPATH = RESOURCESPATH+"/config/config.json";
	private static final int EXPLICITWAIT = 30;
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/ExtentReports/";
	private static String extentReportFilePath="";
	private static final String EXCELPATH = RESOURCESPATH+"/ExcelSheets/TestData1.xlsx";
	public static String getImagepath() {
		return IMAGEPATH;
	}
	private static final String IMAGEPATH=RESOURCESPATH+"/ExcelSheets/Document.JPG";
	
	private static final String RUNMANAGERSHEET="RUNMANAGER";
	private static final String ITERATIONSHEET="RUNMANAGER";

	public static String getRunmanagersheet() {
		return RUNMANAGERSHEET;
	}
	
	public static String getJsonfilepath() {
		return JSONFILEPATH;
	}

	public static String getIterationsheet() {
		return ITERATIONSHEET;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	/**
	 * 
	 * @author Narayana
	 *  @return Extent Report path where the index.html file will be generated.
	 * @throws Exception 
	 */
	public static String getExtentReportFilePath(){
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;
	}

	/**
	 * 
	 * @author Narayana
	 * @return  If Override reports value in the 
	 * property file is no,then the timestamp will be appended
	 * @throws Exception 
	 */
	private static String createReportPath() {
		if(PropertyFileUtils.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}

	public static void setExtentReportFilePath(String extentReportFilePath) {
		FrameWorkConstants.extentReportFilePath = extentReportFilePath;
	}

	public static String getExtentreportfolderpath() {
		return EXTENTREPORTFOLDERPATH;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}
	public static String getFirefoxdriverpath() {
		return FIREFOXDRIVERPATH;
	}
	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getResourcespath() {
		return RESOURCESPATH;
	}

	public static String getPropertyfilepath() {
		return PROPERTYFILEPATH;
	}


}
