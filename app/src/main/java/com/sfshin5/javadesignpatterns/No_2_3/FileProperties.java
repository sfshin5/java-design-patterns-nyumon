package com.sfshin5.javadesignpatterns.No_2_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    private Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String header = "# written by FileProperties\n";
        OutputStream out = new FileOutputStream(filename);
        properties.store(out, header);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }

}
