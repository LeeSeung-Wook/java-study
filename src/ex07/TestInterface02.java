package ex07;

class Shape02 {
    protected int x,y;
}
interface Drawable{
    void draw();
}

class Circle02 extends Shape02 implements Drawable {
    int radius;
    public void draw() {
        System.out.println("Circle Draw at ("+x+","+y+")");
    }
}

public class TestInterface02 {
    public static void main(String[] args) {
        Drawable obj = new Circle02();
        obj.draw();
    }
}
