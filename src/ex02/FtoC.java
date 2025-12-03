package ex02;

public class FtoC {
    public static void main(String[] args) {
        // 1. 화씨 온도 받기 (미국, 캐나다에서 쓰는 온도 F)
        double f = 100.0;
        // System.out.println(f);

        // 2. 섭씨 온도로 변경하기
        double c = 5.0 /9 * (f - 32);
        // System.out.println(f-32);
        // System.out.println(5/9);
        // System.out.println(5.0/9);

        // 3. 출력해서 섭씨 온도 확인하기 (37.7777---)
        System.out.println("섭씨온도는: " + c);
    }
}
