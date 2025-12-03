package algo;

/**
 * 12의 약수를 출력하시오.
 * (1) 비지니스 이해 (12를 1부터~12까지 다 나눠서 나누어떨어지면 약수)
 * (2) 샘플링 6의 약수 구하기
 * (3) 노가다
 * (4) 패턴찾기
 */

public class Divisor01 {
    public static void main(String[] args) {
        int num = 12;
        int a = 1;
        String result = "맞음";

        for (int i = 0; i < num; i++) {
            if(num%a == 0){
                result="맞음";
            }else{
                result="아님";
            }
            System.out.println(a+"은 약수 "+result);
            a++;
        }
    }
}
