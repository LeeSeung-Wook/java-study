package ex03;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";

//        //1행 (space,space,star)
//        System.out.print(space);
//        System.out.print(space);
//        System.out.print(star);
//        System.out.println();
//        //2행 (space,star,star)
//        System.out.print(space);
//        System.out.print(star);
//        System.out.print(star);
//        System.out.println();
//        //3행 (star,star,star)
//        System.out.print(star);
//        System.out.print(star);
//        System.out.print(star);
//        System.out.println();
//----------------------------------------
//        int a = 2;
//        int b = 1;
//        //1행 (space,space,star)
//        for (int i = 0; i < a; i++) {
//            System.out.print(space);
//        }
//        for (int i = 0; i < b; i++) {
//            System.out.print(star);
//        }
//        System.out.println();
//        a--;
//        b++;
//
//        //2행 (space,star,star)
//        for (int i = 0; i < a; i++) {
//            System.out.print(space);
//        }
//        for (int i = 0; i < b; i++) {
//            System.out.print(star);
//        }
//        System.out.println();
//        a--;
//        b++;
//
//        //3행 (star,star,star)
// //      for (int i = 0; i < a; i++) {
// //          System.out.print(space);
// //      }
//        for (int i = 0; i < b; i++) {
//            System.out.print(star);
//        }
//        System.out.println();
//        a--;
//        b++;
// --------------------------------------

        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 라인수를 입력하시오: ");
        int c = sc.nextInt();
        int a = c-1;
        int b = c-a;
        for (int k = 0; k < c; k++) {
            for (int i = 0; i < a; i++) {
                System.out.print(space);
            }
            for (int i = 0; i< b; i++) {
                System.out.print(star);
            }
            System.out.println();
            a--;
            b++;
        }

//        for (int i = 1; i < 6; i++) {
//            for (int k = 0; k < 5-i; k++) {
//                System.out.print(" ");
//            }
//            for (int b = 0; b < i; b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
