package main.java.com.demo.solid.liskov_substitution.bad;

public class Tesla implements Car{
    @Override
    public void start() {
        System.out.println("Tesla start");
    }

    @Override
    public void refuel() {
        System.out.println("Tesla can not refuel");
    }
}
