package ex03;

public class ForExample1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
//        }

//        for (int i = 20; i > 10; i--) {
//            System.out.println(i);
//        }

//        int sum = 0;
//        for (int i = 0; i < 11; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 1; i++) {
//            System.out.print("*");
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.print("*");
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        for (int i = 0; i < 4; i++) {
//            System.out.print("*");
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }

        for (int i = 1; i < 6; i++) {
            for (int k = 0; k < 5-i; k++) {
                System.out.print(" ");
            }
            for (int b = 0; b < i; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
