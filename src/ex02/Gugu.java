package ex02;

public class Gugu {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a+"*1="+ a*1);
        System.out.println(a+"*2="+ a*2);
        System.out.println(a+"*3="+ a*3);
        System.out.println(a+"*4="+ a*4);
        System.out.println(a+"*5="+ a*5);
        System.out.println(a+"*6="+ a*6);
        System.out.println(a+"*7="+ a*7);
        System.out.println(a+"*8="+ a*8);
        System.out.println(a+"*9="+ a*9);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+ i*j);
            }
            System.out.println();
        }
    }

}
