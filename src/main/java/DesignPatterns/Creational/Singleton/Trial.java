package DesignPatterns.Creational.Singleton;

public class Trial {

    public Logger logger;

    public Trial() {
        this.logger = Logger.getLogger();
    }

    public Integer getLogSize(){
        return logger.logCount();

    }

    public void logMessage(String message){
        logger.log(message);

    }
}
