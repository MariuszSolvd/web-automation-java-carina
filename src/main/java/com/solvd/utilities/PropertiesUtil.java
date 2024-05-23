package com.solvd.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }

    private static void loadProperties() {
        try (InputStream stream = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties")) {
            PROPERTIES.load(stream);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
