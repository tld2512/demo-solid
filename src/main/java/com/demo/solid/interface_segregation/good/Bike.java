package main.java.com.demo.solid.interface_segregation.good;

public class Bike implements Movable{
    @Override
    public void move() {
        System.out.println("move");
    }
}
