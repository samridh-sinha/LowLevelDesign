package DesignPatterns.Creational.Singleton;

public class Trial2 {

    Logger logger;

    public Trial2() {
        this.logger = Logger.getLogger();
    }

    public Integer getLogSize(){
        return logger.logCount();
    }

    public void logMessage(String message){
        logger.log(message);
    }

}
