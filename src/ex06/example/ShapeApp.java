package ex06.example;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        Shape c1 = new Circle();
        Shape r1 = new Rectangle();
        Shape t1 = new Triangle();

        arr[0] = c1;
        arr[1] = r1;
        arr[2] = t1;

        for (Shape ar: arr) {
            ar.draw();
        }
    }
}
