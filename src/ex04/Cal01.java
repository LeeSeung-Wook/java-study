package ex04;

// add(+), minus(-), mulit(*), divide(/)
public class Cal01 {

    static void add(int a,int b) {
        System.out.println("a+b="+(a+b));
    }

    static void minus(int a,int b) {
        System.out.println("a-b="+(a-b));
    }

    static void mulit(int a,int b) {
        System.out.println("a*b="+(a*b));
    }

    static void divide(int a,int b) {
        System.out.println("a/b="+(a/b));
    }

    public static void main(String[] args) {
        add(3,5);
        minus(3,5);
        mulit(3,5);
        divide(3,5);
    }
}
