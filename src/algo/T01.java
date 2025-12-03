package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * (1) 비지니스
 * (2) 샘플링
 * (3) 노가다
 * (4) 패턴
 */
public class T01 {
    public static void main(String[] args) {
        int a = 1;
        String result;

//        System.out.println(a);
//        a = a+2;
//
//        System.out.println(a);
//        a = a+2;
//
//        System.out.println(a);
//        a = a+2;
//
//        System.out.println(a);
//        a = a+2;
//
//        System.out.println(a);
//        a = a+2;
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println(a);
//            a = a+2;
//        }

        for (int i = 0; i < 100; i++) {
            if(a%2 == 0){
                result = "맞습니다.";
            }else {
                result = "아닙니다.";
            }
            System.out.println(a+"은 2의 배수가"+result);
            a++;
        }
    }
}
