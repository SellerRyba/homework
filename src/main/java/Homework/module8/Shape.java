package Homework.module8;

public class Shape {
    public static void main(String[] args) {
    AllShape allShape = new AllShape();
    allShape.circle();
    allShape.octagon();
    allShape.quad();
    allShape.rectangle();
    allShape.triangle();
    }
}
interface Circle{
    void circle();
}
interface Quad{
    void quad();
}
interface Octagon{
    void octagon();
}
interface Triangle {
    void triangle();
}
interface Rectangle{
    void rectangle();
}
class AllShape implements Circle,Quad,Octagon,Triangle,Rectangle{
    public void circle() {
        System.out.println("Circle");
    }
    public void quad() {
        System.out.println("Quad");
    }
    public void octagon(){
        System.out.println("Octagon");
    }
    public void triangle(){
        System.out.println("Triangle");
    }
    public void rectangle(){
        System.out.println("Rectangle");
    }
}
