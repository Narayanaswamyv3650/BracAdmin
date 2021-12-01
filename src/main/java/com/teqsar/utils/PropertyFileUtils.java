package com.teqsar.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.teqsar.Exceptions.InvalidPathForPropertyFileException;
import com.teqsar.Exceptions.PropertyFileuseException;
import com.teqsar.constrans.FrameWorkConstants;
import com.teqsar.enums.ConfigProperties;

public class PropertyFileUtils {

	private PropertyFileUtils() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
	static {
		try(FileInputStream file = new FileInputStream(FrameWorkConstants.getPropertyfilepath())) {

			property.load(file);

			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
				System.out.println("After Removing spaces in Config--" + entry);
			}

		} 
		catch (FileNotFoundException e) {
			throw new InvalidPathForPropertyFileException("Please check the path of the config file ");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	// hashtable -little slow, thread safe
	// hashmap - its not thread safe

	public static String getValue(ConfigProperties key) {

		if (Objects.isNull(key) || Objects.isNull((CONFIGMAP.get(key.name().toLowerCase())))) {

			throw new PropertyFileuseException("Property name " + key + " is not found in the config.properties");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}
}


