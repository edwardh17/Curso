package Polimorphism;

public class Main {


    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.draw();
        animal = new Bat();
        animal.draw();
    }
}
