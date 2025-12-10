package Test;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        int n = 20;
        int j = 0;
        int answer = 0;
        int[] arr = new int[n];
        int[] arr1 = {};
        int a = 1;
        for(int i = 0; i<arr.length; i++){
            if(n % a == 0){
                arr[i] = a;
            }
            a++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr1[j] = arr[i];
                j++;
            }
        }
        System.out.println(arr1.length);

    }
}
