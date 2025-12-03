package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTest00 {
    public static void main(String[] args) {
        int money = 1270;
        int restMoney = money;
        int count;

        // 1. 500원으로 나눠서 개수를 구할거다.
        count = restMoney/500;
        restMoney = restMoney%500;
        System.out.println("500동전 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 2. 100원으로 나눠서 개수를 구할거다.
        count = restMoney/100;
        restMoney = restMoney%100;
        System.out.println("100동전 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 3. 50원으로 나눠서 개수를 구할거다.
        count = restMoney/50;
        restMoney = restMoney%50;
        System.out.println("50동전 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 4. 10원으로 나눠서 개수를 구할거다.
        count = restMoney/10;
        restMoney = restMoney%10;
        System.out.println("10동전 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);
    }
}
