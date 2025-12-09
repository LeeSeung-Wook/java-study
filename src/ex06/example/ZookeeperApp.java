package ex06.example;

public class ZookeeperApp {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        Animal d1 = new Dog("콩이");
        Animal c1 = new Cat("나비");
        Animal du1 = new Duck("덕돌이");

        arr[0] = d1;
        arr[1] = c1;
        arr[2] = du1;

        Zookeeper zo = new Zookeeper();

        for(Animal ar: arr){
            zo.action(ar);
        }

    }
}
