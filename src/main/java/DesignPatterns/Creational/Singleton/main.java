package DesignPatterns.Creational.Singleton;

public class main {

    public static void main(String[] args) {
        Trial trial = new Trial();
        Trial2 trial2 = new Trial2();

        trial.logMessage("Message-1");
        Integer logSize = trial.getLogSize();
        System.out.println(logSize);
        trial2.logMessage("Message-2");
        Integer logSize1 = trial2.getLogSize();
        System.out.println(logSize1);
        Integer logSize2 = trial.getLogSize();
        System.out.println(logSize2);
    }
}
