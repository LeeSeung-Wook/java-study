package ex06.example;

public class Duck extends Animal{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    void sound(){
        System.out.println("꽥꽥!");
    }
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    }
    void act() {
        System.out.println("헤엄친다.");
    }
}
