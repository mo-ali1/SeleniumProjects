package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    public static String getProperty (String key){
        return properties.getProperty(key);
    }

    static {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mohbe\\IdeaProjects\\ParaBank\\configuration.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to find Configuration.properties file!");
        }
    }

}

