package com.teqsar.utils;


import java.security.SecureRandom;

public class RandomUtils {

	private RandomUtils() {

	}

	private static final SecureRandom random = new SecureRandom();

	public static String generateRandomString(int length) {

		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++)
			sb.append(text.charAt(random.nextInt(text.length())));
		return sb.toString();

	}

	public static String generateRandomNumericString(int length) {
		String textnumber = "0123456789";
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++)
			sb.append(textnumber.charAt(random.nextInt(textnumber.length())));
		return sb.toString();
	}
	public static String generateDocumentNumber(int length) {
		String textnumber = "0123456789";
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++)
			sb.append(textnumber.charAt(random.nextInt(textnumber.length())));
		return sb.toString();
	}
	
	
	
	public static String generateBracBankMobileNumber(int length) {
		String textnumber = "0123456789";
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++)
			sb.append(textnumber.charAt(random.nextInt(textnumber.length())));
		return "012"+sb.toString();
	}
	

	public static String generateRandomMasterBillNumber() {
		return "MAMU" + generateRandomString(1) + generateRandomNumericString(2);
	}

	public static String generateRandomMasterFileNumber() {
		return generateRandomString(6) + generateRandomNumericString(3);
	}

	public static String generateRandomHBnumber(int i) {

		return generateRandomNumericString(i);
	}

	public static String generateemailId() {
		return generateRandomString(10) + "@gmail.com";

	}

}