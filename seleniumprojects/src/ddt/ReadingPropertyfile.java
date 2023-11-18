package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyfile {

	public static void main(String[] args) throws IOException  {
FileInputStream fs=new FileInputStream("./testdata/data.properties");
Properties property=new Properties();
property.load(fs);
String value=property.getProperty("url");
System.out.println(value);
	}

}
