package Polimorphism;

public class Triangle extends Shape{
    public Triangle() {
    }

    @Override
    draw(){
        System.out.println("    *    ");
        System.out.println("  *   *  ");
        System.out.println(" * * * * ");
    }
}
