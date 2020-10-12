package com.biplob.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
		
		
		
	public static void loadProperty(String propertyFileName) throws FileNotFoundException, IOException  {
			
			Properties properties= new Properties();
			
			properties.load(new FileInputStream(new File("./properties/"+propertyFileName)));
			
			for(String propertyName: properties.stringPropertyNames()) {
				System.setProperty(propertyName, properties.getProperty(propertyName));
			}

			
		}
	
	    
	public static void loadProperties() throws FileNotFoundException, IOException {
		
		loadProperty("webdriver.properties");
		loadProperty("apptest.properties");
	
	  }
	
    }
		
	/* 
	 exm
		public static void ab (String propertyFileName) throws FileNotFoundException, IOException {
			
			
			Properties proper = new Properties();
			
			File file = new File("./properties/"+propertyFileName);
			
			FileInputStream  fis = new FileInputStream(file);
			
			proper.load(fis);
			
			
			proper.load(new FileInputStream (new File("./properties/"+propertyFileName)));
			
			
			for(String key:proper.stringPropertyNames()){
			
				//stringPropertyNames = {"url","user","pass"};	
				
				
				System.setProperty(key, proper.getProperty(key));
				
			}
		}
		
		
		public static void bc () throws FileNotFoundException, IOException{
			
			ab("apptest.properties");
			ab("webdriver.properties");
			
			
		}		
}*/
		
		
		
		
		
		
		
		
	
			
			
			
	


