package algo;

import java.util.Scanner;

public class ChangeData2 {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7} -> {7,6,5,4,3,2,1} reverse
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

//        // 1. arr[0]번지와 arr[6]번지 수왑
//        int t1 = arr[6];
//        arr[6] = arr[0];
//        arr[0] = t1;
//        // 2. arr[1]번지와 arr[5]번지 수왑
//        int t2 = arr[5];
//        arr[5] = arr[1];
//        arr[1] = t2;
//        // 3. arr[2]번지와 arr[4]번지 수왑
//        int t3 = arr[4];
//        arr[4] = arr[2];
//        arr[2] = t3;
//        // 4. arr[3]번지와 arr[3]번지 수왑 -> 교환번지 동일할 때
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        int n = sc.nextInt();

        // 2. 배열 생성
        int[] abc = new int[n];

        // 3. 배열 요소 입력
        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            abc[i] = sc.nextInt();
        }
        int arl = abc.length/2;
        int temp;
        for (int i = 0; i < arl; i++) {
                temp = abc[abc.length - (i + 1)];
                abc[abc.length - (i + 1)] = abc[i];
                abc[i] = temp;
        }
        for (int i = 0; i < abc.length; i++) {
            if(i != abc.length -1)
            System.out.print(abc[i]+",");
            else
                System.out.print(abc[i]);
        }
    }
}
