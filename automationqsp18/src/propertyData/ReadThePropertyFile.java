package propertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadThePropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/Config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("un");
		System.out.println(value);
		

	}

}
