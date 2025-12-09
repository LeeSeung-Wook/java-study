package ex06.example;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    void sound(){
        System.out.println("멍멍!");
    }
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    }
    void act() {
        System.out.println("꼬리를 흔든다.");
    }
}
