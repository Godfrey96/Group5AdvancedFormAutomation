package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    public ConfigReader() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\TechGads\\OneDrive\\Documents\\2026\\Ndosi Automation\\Selenium Java\\Group5AdvancedFormAutomation\\src\\test\\resources\\configurations\\config.properties");
            prop.load(fis);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

//    public String getURL() {
//        return prop.getProperty("URL");
//    }

    public String getBrowser() {
        return prop.getProperty("BROWSER");
    }
}
