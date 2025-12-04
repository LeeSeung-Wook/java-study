package algo;

import java.util.Arrays;

// 4찾기
public class BSearch04 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3,0,11}; // 7개

        //1. 정렬
        Arrays.sort(arr); // 0, 1, 2, 3, 4, 10, 11

        int target = 2;
        int mid = arr.length/2; // 3
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < mid; i++) {
            if(target == arr[mid]){ // 0, 1, 2, 3, 4, [10], 11
                System.out.println(target+"를 찾았습니다.");
                return;
            }

            if(target > arr[mid]){
                mid = (end-start)/2 + start;
                start = mid+1;
            }

            if(target < arr[mid]) {
                mid = (end-start)/2 + start;
                end = mid-2;
            }
        }

        if(target == arr[mid]){ // 0, 1, 2, 3, 4, [10], 11
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        System.out.println("main끝");
    }
}
