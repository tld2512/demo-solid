package main.java.com.demo.solid.liskov_substitution.good;

public class AudiA7 implements Car{
    @Override
    public void start() {
        System.out.println("Audi A7 start");
    }

    @Override
    public void refuel() {
        System.out.println("refuel gas");
    }
}
