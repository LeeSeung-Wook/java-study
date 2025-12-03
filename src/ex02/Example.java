package ex02;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==========================");

        Scanner sc = new Scanner(System.in);

        System.out.println("번호를 선택하시오: ");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("화씨온도를 입력하시오:");
            double temp = sc.nextDouble();

            double extemp = 5*(temp -32) / 9;
            System.out.println("섭씨온도는 " + extemp);
        }
        else if(num == 2) {
            System.out.println("섭씨온도를 입력하시오:");
            double temp = sc.nextDouble();

            double extemp = 9 * temp / 5 + 32;
            System.out.println("화씨온도는 " + extemp);
        }
        else {
            System.out.println("잘못된 번호 입니다.");
        }
    }
}
