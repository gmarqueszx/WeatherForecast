package com.wheaterforecast.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static Properties prop;
    private static Config config;

    private Config() {
        try {

            if (prop == null) {
                prop = new Properties();
                InputStream is = this.getClass().getResourceAsStream("/com/wheaterforecast/config/config.properties");
                prop.load(is);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}
