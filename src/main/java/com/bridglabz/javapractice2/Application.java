package com.bridglabz.javapractice2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class Application {
    public static final Logger Log = LogManager.getLogger(App.class);
    public static void main(String[] args)
    {
        String message = "Hello world";
        Log.debug(message + "will be printed on debug ");
        Log.info(message + "will be printed on info");
        Log.warn(message + "will be printed on warn ");
        Log.error(message + "will be printed on error ");
        Log.fatal(message + "will be printed on fatal ");
        Log.info("Appending string: {}" + message);
        System.out.println("message");
    }
}
