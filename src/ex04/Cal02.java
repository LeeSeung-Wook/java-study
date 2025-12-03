package ex04;

// add(+), minus(-), mulit(*), divide(/)
public class Cal02 {

    static int add(int a,int b) {
        return a+b;
    }

    static int minus(int a,int b) {
        return a-b;
    }

    static int mulit(int a,int b) {
        return a*b;
    }

    static int divide(int a,int b) {
        return a/b;
    }

    public static void main(String[] args) {
        int r1 = add(3,5);
        int r2 = minus(3,5);
        int r3 = mulit(3,5);
        int r4 = divide(3,5);

        System.out.println(r1+r2+r3+r4);
    }
}
