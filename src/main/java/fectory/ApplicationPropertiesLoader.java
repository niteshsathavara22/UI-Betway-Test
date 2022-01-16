package fectory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ApplicationPropertiesLoader {
    static Properties prop;
    static FileInputStream input;
    // static String fileName = "config.properties";
    static String fileLocation = "src/test/resources/testData/config.properties";

    public String getProperty(String keyName) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
}
