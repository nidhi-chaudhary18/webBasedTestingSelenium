package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    Properties properties = new Properties();
    InputStream inputStream = null;
    private static final String CONFIG_FILE_PATH = "src/test/resources/config/config.properties";

    public ConfigReader() throws FileNotFoundException {
        loadProperties();
    }
    private void loadProperties() throws FileNotFoundException {
        try {
            inputStream = new FileInputStream(CONFIG_FILE_PATH);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }
}
