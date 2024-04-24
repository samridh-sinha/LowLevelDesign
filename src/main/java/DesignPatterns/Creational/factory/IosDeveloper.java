package DesignPatterns.Creational.factory;

public class IosDeveloper implements  Employee{
    @Override
    public int getSalary() {
        return 60000;
    }

    @Override
    public String name() {
        return "Ios Developer";
    }
}
