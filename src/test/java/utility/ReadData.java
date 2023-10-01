package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	private static String path="resources/Config/config.properties";
	private static FileInputStream input=null;
	private static Properties properties = new Properties();
	
	public static String getData(String value) {
		try {
			input = new FileInputStream(path);
			properties.load(input);
		} catch (IOException  e) {
			e.printStackTrace();
		}finally {
			if(input!=null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return properties.getProperty(value);
	}

}
