package DesignPatterns.Creational.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger logger;

    private List<String> logList;


    private Logger() {
        this.logList = new ArrayList<>();
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                logger = new Logger();
            }
        }
        return logger;
    }

    public void log(String message) {
        logList.add(message);
        System.out.println(message);
    }

    public Integer logCount() {
        return this.logList.size();
    }
}
