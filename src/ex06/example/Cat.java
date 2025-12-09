package ex06.example;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    void sound(){
        System.out.println("야옹~");
    }
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    }
    void act() {
        System.out.println("할퀸다.");
    }
}
