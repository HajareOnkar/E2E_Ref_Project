package gnearicLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getPropertyFile(String Key) throws IOException
	{
	Properties p = new Properties();
	FileInputStream Fis=new FileInputStream(AutoConstant.propertyFilePath);
	p.load(Fis);
	return p.getProperty(Key);
	
	}
	

}
