package com.sfshin5.javadesignpatterns.no02_adapter.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("C:\\Users\\s-fujiwara\\Documents\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "5");
            f.writeToFile("C:\\Users\\s-fujiwara\\Documents\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
