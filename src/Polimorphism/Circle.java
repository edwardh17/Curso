package Polimorphism;

public class Circle extends Shape{
    public Circle() {
    }

    @Override
    draw(){
        System.out.println("    *    ");
        System.out.println("  *   *  ");
        System.out.println("    *    ");
    }
}
