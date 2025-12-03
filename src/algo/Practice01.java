package algo;

import java.util.Scanner;

public class Practice01 {

    static int[] 약수구하기(int d){
        int[] arr = new int[d];
        int b = 0;
        for (int i = 1; i <= arr.length; i++) {
            if(arr.length%i == 0) {
                arr[b] = i;
                b++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int num = 6;
//
//        int a = 1;
//        String result = "맞음";
//
//        for (int j = 1; j < 3; j++) {
//            for (int i = 0; i < num*j; i++) {
//                if(num*j%a == 0){
//                    result="맞음";
//                }else{
//                    result="아님";
//                }
//                System.out.println(a+"은"+(num*j)+"의 약수 "+result);
//                a++;
//            }
//            System.out.println();
//            a=1;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 2개 입력하시오: ");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int[] arr1 = 약수구하기(a);
        int[] arr2 = 약수구하기(c);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    if(arr1[i] == 0 || arr2[j] == 0) break;
                    if(arr2[j] > max){
                        max = arr2[j];
                    }
                }
            }
        }

        System.out.print("arr1의 배열: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("arr2의 배열: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println(arr1.length+"와 "+arr2.length+"의 최대공약수는 "+max);
    }
}
