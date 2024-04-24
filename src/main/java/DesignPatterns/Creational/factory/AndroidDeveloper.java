package DesignPatterns.Creational.factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String name() {
        return "AndroidDeveloper";
    }
}
