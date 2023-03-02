package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValue {
    public String getPropertyValue(String name) throws FileNotFoundException {
        String filename = "src/main/resources/config.properties";
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(filename);
            properties.load(file);
            return properties.getProperty(name);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }
}
