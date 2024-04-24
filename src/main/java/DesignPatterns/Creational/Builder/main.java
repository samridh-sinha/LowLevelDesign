package DesignPatterns.Creational.Builder;

public class main {
    public static void main(String[] args) {
        Car builtcar = new CarBuilder().setColor("Red").setBrand("Hyundai").build();
        Car crete = new CarBuilder().setModel("Crete").build();

        System.out.println(crete);
        System.out.println(builtcar);
    }
}
