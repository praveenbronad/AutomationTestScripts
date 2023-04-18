/**
 * 
 */
package genericUtilLib;

import java.io.FileInputStream;
import java.util.Properties;


/**
 * @author Praveen B Ronad
 *
 */
public class PropertyFile {
	public String getPropertyData(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
